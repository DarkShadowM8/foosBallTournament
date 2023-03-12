package com.foosball.modelsDTO;

import java.util.Date;

public class TournamentDto {
	
	private Long tournamentID;
	private String tournamentName;
	private Long numberOfTeams;
	private String tournamentLocation;
	
	private Date tournamentStartDate;
	private Date tournamentEndDate;
	
	public Long getTournamentID() {
		return tournamentID;
	}
	public void setTournamentID(Long tournamentID) {
		this.tournamentID = tournamentID;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public Long getNumberOfTeams() {
		return numberOfTeams;
	}
	public void setNumberOfTeams(Long numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}
	public String getTournamentLocation() {
		return tournamentLocation;
	}
	public void setTournamentLocation(String tournamentLocation) {
		this.tournamentLocation = tournamentLocation;
	}
	public Date getTournamentStartDate() {
		return tournamentStartDate;
	}
	public void setTournamentStartDate(Date tournamentStartDate) {
		this.tournamentStartDate = tournamentStartDate;
	}
	public Date getTournamentEndDate() {
		return tournamentEndDate;
	}
	public void setTournamentEndDate(Date tournamentEndDate) {
		this.tournamentEndDate = tournamentEndDate;
	}
	
}
