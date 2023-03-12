package com.foosball.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.foosball.enumerations.Result;

@Entity
@Table(name = "Matches")
public class Match implements Serializable{

//////////////////////////////////////////////////////////////////////////////////////////////////
//										FIELDS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "team_1", referencedColumnName = "name")
	private Team team_1;
	
	@ManyToOne
	@JoinColumn(name = "team_2", referencedColumnName = "name")
	private Team team_2;

	@Column(name = "team_1_score")
	private Integer roundsWinByTeam_1;
	
	@Column(name = "team_2_score")
	private Integer roundsWinByTeam_2;
	
	private String toss;
	private String winner;
	
	@ManyToOne
	@JoinColumn(name = "tournament", referencedColumnName = "id")
	private Tournament tournament;
	
	private String location;
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//									CONSTRUCTOR
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Match() {
		this.roundsWinByTeam_1 = 0;
		this.roundsWinByTeam_2 = 0;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//									GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam_1() {
		return team_1;
	}

	public void setTeam_1(Team team_1) {
		this.team_1 = team_1;
	}

	public Team getTeam_2() {
		return team_2;
	}

	public void setTeam_2(Team team_2) {
		this.team_2 = team_2;
	}

	public Integer getRoundsWinByTeam_1() {
		return roundsWinByTeam_1;
	}

	public void setRoundsWinByTeam_1(Integer roundsWinByTeam_1) {
		this.roundsWinByTeam_1 = roundsWinByTeam_1;
	}

	public Integer getRoundsWinByTeam_2() {
		return roundsWinByTeam_2;
	}

	public void setRoundsWinByTeam_2(Integer roundsWinByTeam_2) {
		this.roundsWinByTeam_2 = roundsWinByTeam_2;
	}

	public String getToss() {
		return toss;
	}

	public void setToss(Result toss) {
		switch (toss) {
		case team1:
			this.toss = team_1.getName();
			break;
		case team2:
			this.toss = team_2.getName();
			break;
		default:
			this.toss = "Pending";
			break;
		}
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(Result winner) {
		switch (winner) {
		case team1:
			this.toss = team_1.getName();
			break;
		case team2:
			this.toss = team_2.getName();
			break;
		default:
			this.toss = "Pending";
			break;
		}
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	
	
}


