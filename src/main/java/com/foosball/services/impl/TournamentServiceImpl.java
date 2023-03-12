package com.foosball.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.foosball.adapters.TournamentAdapter;
import com.foosball.models.Tournament;
import com.foosball.modelsDTO.TournamentDto;
import com.foosball.repositories.TournamentRepository;
import com.foosball.services.interfaces.TournamentService;

public class TournamentServiceImpl implements TournamentService{
	@Autowired
	private TournamentRepository tournamentRepository;

	@Override
	public TournamentDto addTournament(TournamentDto tournamentDTO) {
		TournamentAdapter tournamentAdapterObj = new TournamentAdapter();
		Tournament tournamentEntity = tournamentAdapterObj.convertDTOtoDAO(tournamentDTO);
		tournamentRepository.save(tournamentEntity);
		return tournamentAdapterObj.convertDAOtoDTO(tournamentEntity);
	}

	@Override
	public List<TournamentDto> getAll() {
		TournamentAdapter tournamentAdapterObj = new TournamentAdapter();
		List<Tournament> tournamentEntityList = tournamentRepository.findAll();
		List<TournamentDto> tournamentDtoList = new ArrayList();
		for (Tournament te : tournamentEntityList) {
			tournamentDtoList.add(tournamentAdapterObj.convertDAOtoDTO(te));
		}
		return tournamentDtoList;
	}

	@Override
	public TournamentDto deleteTournament(TournamentDto tournamentDTO) {
		TournamentAdapter tournamentAdapterObj = new TournamentAdapter();
		Tournament tournamentEntityObject = tournamentAdapterObj.convertDTOtoDAO(tournamentDTO);
		
		Tournament foundTournaments = tournamentRepository.findById(tournamentEntityObject.getTournamentID()).get();
		
//		foundTournaments.setName(tournamentDTO.getName());
//		foundTournaments.setAge(tournamentDTO.getAge());
//		tournamentRepository.save(foundTournaments);
		
		tournamentRepository.delete(foundTournaments);
		return tournamentAdapterObj.convertDAOtoDTO(foundTournaments);
	}
}
