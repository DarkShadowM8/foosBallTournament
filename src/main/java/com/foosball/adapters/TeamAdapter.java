package com.foosball.adapters;

import com.foosball.models.Team;
import com.foosball.modelsDTO.TeamDto;

public class TeamAdapter {
//
////	CaptainAdapter captainAdapter = new CaptainAdapter();
//	
	public Team _toDao (TeamDto teamDto) {	
		Team team = new Team();
		return _toDaoUpdate(team, teamDto);
	}
	
	public Team _toDaoUpdate(Team team, TeamDto teamDto) {
		team.setName(teamDto.getName());
		
		return team;
	}
	
	public TeamDto _toDto(Team team) {
		TeamDto teamDto = new TeamDto();
		teamDto.setId(team.getId());
		teamDto.setName(team.getName());
		
		return teamDto;
	}
}
