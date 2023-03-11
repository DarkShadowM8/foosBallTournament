package com.foosball.services.interfaces;

import java.util.List;

import com.foosball.models.Player;
import com.foosball.modelsDTO.PlayerDto;
import com.foosball.modelsDTO.TeamDto;

public interface TeamService {
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//						TEAM BASIC CRUD ABSTRACT METHODS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String add(TeamDto teamDto);
	public List<TeamDto> getAll();
	public TeamDto findById(long id);	
	public String update(long id, TeamDto teamDto);
	public String delete(long id);
	public String deleteAll();
	
/*/////////////////////////////////////////////////////////////////////
					Team Captain Abstract Methods
/////////////////////////////////////////////////////////////////////*/
	
	public PlayerDto getTeamCaptain(long id);
	public List<PlayerDto> getAllCaptain();
	
}
