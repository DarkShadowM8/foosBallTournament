package com.foosball.services.interfaces;

import java.util.List;

import com.foosball.modelsDTO.MatchAddDto;
import com.foosball.modelsDTO.MatchGetDto;

public interface MatchService {
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//						SERVICE BASIC CREATE & GET ABSTRACT METHODS
//////////////////////////////////////////////////////////////////////////////////////////////////

	public String add(MatchAddDto matchDto);
	public MatchGetDto findById(long id);
	public List<MatchGetDto> getAll();
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//						SERVICE UDPATE ABSTRACT METHODS
//////////////////////////////////////////////////////////////////////////////////////////////////

	public String update_AddScore(long matchId, String teamName);
	public String update_toss(long matchId, String teamName);
	public String update_winner(long matchId, String teamName);
	public String update(long matchId, MatchAddDto matchDto);
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//						SERVICE DELETE ABSTRACT METHODS
//////////////////////////////////////////////////////////////////////////////////////////////////

	
	public String delete(long matchId);
	public String deleteAll();
}
