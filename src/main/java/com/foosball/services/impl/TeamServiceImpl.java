package com.foosball.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.foosball.adapters.PlayerAdapter;
import com.foosball.adapters.TeamAdapter;
import com.foosball.enumerations.PlayerStatus;
//import com.foosball.adapters.CaptainAdapter;
import com.foosball.models.*;
import com.foosball.modelsDTO.PlayerDto;
//import com.foosball.modelsDTO.CaptainDto;
import com.foosball.modelsDTO.TeamDto;
//import com.foosball.repositories.CaptainRepository;
import com.foosball.repositories.PlayerRepository;
import com.foosball.repositories.PointsTableRepository;
import com.foosball.repositories.TeamRepostiory;
import com.foosball.repositories.TournamentRepository;
import com.foosball.services.interfaces.PlayerService;
//import com.foosball.services.interfaces.CaptainService;
import com.foosball.services.interfaces.TeamService;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{

//////////////////////////////////////////////////////////////////////////////////////////////////
//									AUTOWIRED BEANS
//////////////////////////////////////////////////////////////////////////////////////////////////
	@Autowired
	private  TeamRepostiory teamRepo;
	
	@Autowired
	private  PlayerRepository playerRepo;
	
	@Autowired
	private  PlayerService playerService;
	
	@Autowired
	private  TournamentRepository tournamentRepo;
	
	@Autowired
	private  PointsTableRepository pointsTableRepo;
//////////////////////////////////////////////////////////////////////////////////////////////////
//										ADAPTERS
//////////////////////////////////////////////////////////////////////////////////////////////////

	private  TeamAdapter teamAdapter = new TeamAdapter();
	private  PlayerAdapter playerAdapter = new PlayerAdapter();
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//							TEAM BASIC CRUD ABSTRACT METHOD'S IMPLEMENTATION
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String add(TeamDto teamDto) {
		
		Team team = teamAdapter._toDao(teamDto);
		teamRepo.save(team);
		return teamAdapter._toDto(team).toString();
	}

	public List<TeamDto> getAll() {
		
		List<Team> teamList = teamRepo.findAll();
		List<TeamDto> teamDtoList = new ArrayList<>();
		
		for (Team team : teamList) {
			teamDtoList.add(teamAdapter._toDto(team));
		}
		
		return teamDtoList;
	}

	public TeamDto findById(long id) {
		
		Optional<Team> team = teamRepo.findById(id);
		if (team.isPresent()) {
			TeamDto teamDto = teamAdapter._toDto(team.get());
			return teamDto;
		}
		
		return null;
	}

	public String update(long id, TeamDto teamDto) {
		Optional<Team> team = teamRepo.findById(id);
		if (team.isPresent()) {
			teamAdapter._toDaoUpdate(team.get(), teamDto);
			
			Optional<Tournament> tournament = tournamentRepo.findById(teamDto.getTournament());
			
			if (tournament.isEmpty()) {
				return "Team id is not correct!!!";
			}
			
			PointsTable pointsTable = new PointsTable();
			pointsTable.setTeam(team.get());
			pointsTable.setTournament(tournament.get());
			pointsTableRepo.save(pointsTable);
			
			team.get().setTournament(tournament.get());
			
			return "Team with id: " + id + " updated Successfully!!!" ;
		}
		return "Team with id: " + id + " not Found!!!";
	}
	
	public String delete(long id) {
		Optional<Team> team = teamRepo.findById(id);
		if (team.isPresent()) {
			teamRepo.delete(team.get());
			return "Team with id: " + id + " deleted Successfully!!!" ;
		}
		return "Team with id: " + id + " not Found!!!";
	}

	public String deleteAll() {
		teamRepo.deleteAll();
		return "All teams data deleted Successfully!!!";
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//						TEAM CAPTAOM ABSTRACT METHOD'S IMPLEMENTATION
//////////////////////////////////////////////////////////////////////////////////////////////////

	public PlayerDto getTeamCaptain(long teamId) {
		Optional<Team> team = teamRepo.findById(teamId);
		if (team.isPresent()) {
			Player player = (Player) playerRepo.findByStatusAndTeam_Name(PlayerStatus.Captain, team.get().getName());
			PlayerDto playerDto = playerAdapter._toDto(player);
			return playerDto;
		}
		
		return null;
	}
	
	public List<PlayerDto> getAllCaptain() {
		List<Player> playerList  = playerRepo.findByStatus(PlayerStatus.Captain);
		List<PlayerDto> listDto = new ArrayList<>();
		
		for (Player player : playerList) {
			listDto.add(playerAdapter._toDto(player));
		}
		
		return listDto;
	}
	
	
	
}
/*	
	@Autowired
    CaptainService captainService;

	CaptainAdapter captainAdapter = new CaptainAdapter();
	
	@Override
	public TeamDto add(TeamDto teamDto) {
		
		Optional<Team> team = teamRepository.findByName("teamA");
		if (team.isPresent()) {
		    Team foundTeam = team.get();
		    // Do something with the found team
		} else {
		    // Handle case where team was not found
		}
		
		Team team = new Team();
		
		team.setName(teamDto.getName());
		
		CaptainDto captainDto = captainService.findByID(teamDto.getCaptain());
		team.setCaptain(captainAdapter._toDao(captainDto));
		
		return dozer.map(team, TeamDto.class);
	}
	


	@Override
	public List<TeamDto> getAll() {
		List<Team> team = new ArrayList<>();
		List<TeamDto> teamDto = new ArrayList<>();
		team = teamRepo.findAll();
		for (Team object : team) {
			teamDto.add(dozer.map(object, TeamDto.class));
		}
		return teamDto;
	}

}
	@Override
public TeamDto add(TeamDto teamDto) {
	Team teamDao = dozer.map(teamDto, Team.class);
	
	
	Team team = new Team();
	
	team.setName(teamDto.getName());
	
	CaptainDto captainDto = teamDto.getCaptain();
	if (captainDto != null) {
		Captain captain = new Captain();
	}
	
	teamRepo.save(teamDao);
	return teamDto;
}
*/