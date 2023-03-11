package com.foosball.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foosball.adapters.MatchAdapter;
import com.foosball.adapters.TeamAdapter;
import com.foosball.enumerations.Result;
import com.foosball.models.Match;
import com.foosball.models.Team;
import com.foosball.modelsDTO.MatchAddDto;
import com.foosball.modelsDTO.MatchGetDto;
import com.foosball.modelsDTO.TeamDto;
import com.foosball.repositories.MatchRepository;
import com.foosball.repositories.TeamRepostiory;
import com.foosball.services.interfaces.MatchService;
import com.foosball.services.interfaces.TeamService;

@Service
public class MatchServiceImp implements MatchService {

//////////////////////////////////////////////////////////////////////////////////////////////////
//								AUTOWIRED BEANS
//////////////////////////////////////////////////////////////////////////////////////////////////
	@Autowired
	public MatchRepository matchRepo;
	
	@Autowired
	public TeamRepostiory teamRepo;
	
	@Autowired
	TeamService teamService;
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//									ADAPTERS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public MatchAdapter matchAdapter = new MatchAdapter();
	public TeamAdapter teamAdapter = new TeamAdapter();

//////////////////////////////////////////////////////////////////////////////////////////////////
//				SERVICE BASIC CREATE & GET ABSTRACT METHOD's IPLEMENTATION	
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String add(MatchAddDto matchDto) {
		
		Match match = new Match();
		
		TeamDto team_1 = teamService.findById(matchDto.getTeam_1_Id());
		TeamDto team_2 = teamService.findById(matchDto.getTeam_2_Id());
		
		match.setTeam_1(teamAdapter._toDao(team_1));
		match.setTeam_2(teamAdapter._toDao(team_2));
		match.setName(team_1.getName() + " vs " + team_2.getName());
		match.setToss(Result.pending);
		match.setWinner(Result.pending);
		match.setLocation(matchDto.getLocation());
		
		matchRepo.save(match);
		
		return matchAdapter._toDto(match).toString();
	}
	
	public MatchGetDto findById(long id) {
		Optional<Match> match = matchRepo.findById(id);
		
		if(match.isPresent()) {
			return matchAdapter._toDto(match.get());
		}
		
		return null;
	}
	
	public List<MatchGetDto> getAll(){
		
		List<Match> matchList = matchRepo.findAll();
		List<MatchGetDto> matchDtoList = new ArrayList<>();
		
		for (Match match : matchList) {
			matchDtoList.add(matchAdapter._toDto(match));
		}
		
		return matchDtoList;
		
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
//					SERVICE UDPATE ABSTRACT METHOD'S IMPLEMENTATION
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String update_AddScore(long matchId, String teamName) {
		
		Optional<Match> match = matchRepo.findById(matchId);
		if (match.isPresent()) {
			if (match.get().getTeam_1().getName().equals(teamName)) {
				match.get().setRoundsWinByTeam_1(match.get().getRoundsWinByTeam_1() + 1);
			}
			else if(match.get().getTeam_2().getName().equals(teamName)){
				match.get().setRoundsWinByTeam_2(match.get().getRoundsWinByTeam_2() + 1);
			}
			else {
				return "Team name is not Correct!!!";
			}
			
			return match.get().getName() + " score is Updated!!!";
		}
		
		return "Match ID not Found!!!";
	}
	
	public String update_toss(long matchId, String teamName) {
		Optional<Match> match = matchRepo.findById(matchId);
		if (match.isPresent()) {
			if (match.get().getTeam_1().getName().equals(teamName)) {
				match.get().setToss(Result.team1);
			}
			else if(match.get().getTeam_2().getName().equals(teamName)){
				match.get().setToss(Result.team2);
			}
			else {
				return "Team name is not Correct!!!";
			}
			return " Toss for " + match.get().getName() + " is Updated!!!";
		}
		
		return "Match ID not Found!!!";
	}

	public String update_winner(long matchId, String teamName) {
		Optional<Match> match = matchRepo.findById(matchId);
		if (match.isPresent()) {
			if (match.get().getTeam_1().getName().equals(teamName)) {
				match.get().setWinner(Result.team1);
			}
			else if(match.get().getTeam_2().getName().equals(teamName)){
				match.get().setWinner(Result.team2);
			}
			else {
				return "Team name is not Correct!!!";
			}
			return "Winner for " + match.get().getName() + " is " + match.get().getWinner();
		}
		
		return "Match ID not Found!!!";
	}
	
	public String update(long matchId, MatchAddDto matchDto) {
		
		Optional<Match> match = matchRepo.findById(matchId);
		if (match.isPresent()) {
			if (matchDto.getTeam_1_Id() != null) {
				Team team = teamAdapter._toDao(teamService.findById(matchId));
				match.get().setTeam_1(team);
			}
			if (matchDto.getTeam_2_Id() != null) {
				Team team = teamAdapter._toDao(teamService.findById(matchId));
				match.get().setTeam_2(team);
			}
			if (matchDto.getLocation() != null) {
				match.get().setLocation(matchDto.getLocation());
			}
			
			matchRepo.save(match.get());
			return match.get().getName() + " updated Successfully!!!";
		}
		
		return "Match ID not found!!!";
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
//						SERVICE DELETE ABSTRACT METHOD'S IMPLEMENTATION
//////////////////////////////////////////////////////////////////////////////////////////////////

	public String delete(long matchId) {
		Optional<Match> match = matchRepo.findById(matchId);
		if (match.isPresent()) {
			matchRepo.delete(match.get());
			return "match with id: " + matchId + " is deleted successfully!!!";
		}
		
		return "Match ID not found!!!";
	}
	
	public String deleteAll() {
		matchRepo.deleteAll();
		return "deleted Successfully!!!";
	}
}
