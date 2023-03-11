package com.foosball.services.interfaces;

import com.foosball.modelsDTO.PlayerSkillCardDto;

public interface PlayerSkillCardService {
	public String update(long id, PlayerSkillCardDto skillDto);
}
