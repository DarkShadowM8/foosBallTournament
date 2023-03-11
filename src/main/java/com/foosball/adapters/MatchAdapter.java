package com.foosball.adapters;

import com.foosball.models.Match;
import com.foosball.modelsDTO.MatchAddDto;
import com.foosball.modelsDTO.MatchGetDto;

public class MatchAdapter {
	
	TeamAdapter teamAdapter = new TeamAdapter();
	
	
	public MatchGetDto _toDto(Match match) {
		MatchGetDto matchDto = new MatchGetDto();
		matchDto.setId(match.getId());
		matchDto.setName(match.getName());
		matchDto.setTeam_1(match.getTeam_1().getName());
		matchDto.setTeam_2(match.getTeam_2().getName());
		matchDto.setRoundsWinByTeam_1(match.getRoundsWinByTeam_1());
		matchDto.setRoundsWinByTeam_2(match.getRoundsWinByTeam_2());
		matchDto.setToss(match.getToss());
		matchDto.setWinner(match.getWinner());
		matchDto.setLocation(match.getLocation());
		
		return matchDto;
	}
}
