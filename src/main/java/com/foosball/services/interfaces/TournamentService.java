package com.foosball.services.interfaces;

import java.util.List;

import com.foosball.modelsDTO.TournamentDto;

public interface TournamentService {
	public TournamentDto addTournament(TournamentDto tournamentDTO);
	public TournamentDto deleteTournament(TournamentDto tournamentDTO);
	public List<TournamentDto> getAll();
}
