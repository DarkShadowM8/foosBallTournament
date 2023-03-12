package com.foosball.adapters;

import com.foosball.models.Tournament;
import com.foosball.modelsDTO.TournamentDto;

public class TournamentAdapter {

	public Tournament convertDTOtoDAO(TournamentDto tournamentDTO) {
		Tournament tournamentEntity = new Tournament();
		tournamentEntity.setTournamentID(tournamentDTO.getTournamentID());
		tournamentEntity.setTournamentName(tournamentDTO.getTournamentName());
		tournamentEntity.setNumberOfTeams(tournamentDTO.getNumberOfTeams());
		tournamentEntity.setTournamentLocation(tournamentDTO.getTournamentLocation());
		tournamentEntity.setTournamentStartDate(tournamentDTO.getTournamentStartDate());
		tournamentEntity.setTournamentEndDate(tournamentDTO.getTournamentEndDate());
		return tournamentEntity;
	}
	
	public TournamentDto convertDAOtoDTO(Tournament tournamentEntity) {
		TournamentDto tournamentDTO = new TournamentDto();
		tournamentDTO.setTournamentID(tournamentEntity.getTournamentID());
		tournamentDTO.setTournamentName(tournamentEntity.getTournamentName());
		tournamentDTO.setNumberOfTeams(tournamentEntity.getNumberOfTeams());
		tournamentDTO.setTournamentLocation(tournamentEntity.getTournamentLocation());
		tournamentDTO.setTournamentStartDate(tournamentEntity.getTournamentStartDate());
		tournamentDTO.setTournamentEndDate(tournamentEntity.getTournamentEndDate());
		return tournamentDTO;
	}
}
