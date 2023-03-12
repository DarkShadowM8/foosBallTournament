package com.foosball.models;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="tournaments")
public class Tournament implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String tournamentName;
	
	@Column
	private Long numberOfTeams;
	
	@Column
	private String tournamentLocation;
	
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date tournamentStartDate;
	
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date tournamentEndDate;

	public Long getTournamentID() {
		return id;
	}

	public void setTournamentID(Long tournamentID) {
		this.id = tournamentID;
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
