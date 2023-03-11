package com.foosball.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foosball.adapters.PlayerAdapter;
import com.foosball.models.Player;
import com.foosball.models.Team;
import com.foosball.modelsDTO.PlayerDto;
import com.foosball.repositories.PlayerRepository;
import com.foosball.repositories.TeamRepostiory;
import com.foosball.services.interfaces.PlayerService;

@Service
public class PlayerServiceImp implements PlayerService {

//////////////////////////////////////////////////////////////////////////////////////////////////
//								AUTOWIRED BEANS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	private PlayerRepository playerRepo;

//////////////////////////////////////////////////////////////////////////////////////////////////
//									ADAPTERS
//////////////////////////////////////////////////////////////////////////////////////////////////

	PlayerAdapter playerAdapter = new PlayerAdapter();
	
	@Autowired
	TeamRepostiory teamRepo;

//////////////////////////////////////////////////////////////////////////////////////////////////
//							SERVICE SERVICE CRUD METHOD'S IMPLEMENTATION
//////////////////////////////////////////////////////////////////////////////////////////////////

	public PlayerDto add(PlayerDto playerDto) {
		Player player = playerAdapter._toDao(playerDto);
		playerRepo.save(player);
		return playerAdapter._toDto(player);
	}
	
	public List<PlayerDto> getAll(){
		List<Player> list = playerRepo.findAll();
		
		List<PlayerDto> listDto = new ArrayList<>();
		
		for (Player player : list) {
			listDto.add(playerAdapter._toDto(player));
		}
		
		return listDto;
	}
	
	public PlayerDto findById(long id) {
		Optional<Player> optionalPlayer = playerRepo.findById(id);
		if (optionalPlayer.isPresent()) {
			PlayerDto playerDto = playerAdapter._toDto(optionalPlayer.get());
			return playerDto;
		}
		return null;
	}
	
	public String deleteById(long id) {
		Optional<Player> optionalPlayer = playerRepo.findById(id);
		if (optionalPlayer.isPresent()) {
			playerRepo.delete(optionalPlayer.get());
			return "Player with id: " + id + " is deleted Successfully!!!";
		}
		
		return "Player with id: " + id + " not found!";
	}
	
	public String deleteAll() {
		playerRepo.deleteAll();
		return "All Player entities are deleted Successfully!!!";
	}
	
	public PlayerDto update(PlayerDto playerDto) {
		Optional<Player> optionalPlayer = playerRepo.findById(playerDto.getId());
		Team optionalTeam = null;
		if(null!=playerDto.getTeam()) {
			optionalTeam = teamRepo.findByName(playerDto.getTeam().getName());
		}
		if (optionalPlayer.isPresent()) {
			if(null !=optionalTeam) {
				optionalPlayer.get().setTeam(optionalTeam);
			}
			Player player = playerAdapter._toDaoUpdate(optionalPlayer.get(), playerDto);
			player = playerRepo.save(player);
			return playerAdapter._toDto(player);
		}
		return null;
		
	}
}
