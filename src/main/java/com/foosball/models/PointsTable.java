package com.foosball.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class PointsTable {
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//Fields
//////////////////////////////////////////////////////////////////////////////////////////////////

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "team")
	private Team team;
	
	@ManyToOne
	@JoinColumn(name = "tournament", referencedColumnName = "id")
	private Tournament tournament;
	
	private Integer toatlPlayedMatch;
	private Integer win;
	private Integer loss;
	private Integer points;
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getToatlPlayedMatch() {
		return toatlPlayedMatch;
	}
	public void setToatlPlayedMatch(Integer toatlPlayedMatch) {
		this.toatlPlayedMatch = toatlPlayedMatch;
	}
	public Integer getWin() {
		return win;
	}
	public void setWin(Integer win) {
		this.win = win;
	}
	public Integer getLoss() {
		return loss;
	}
	public void setLoss(Integer loss) {
		this.loss = loss;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	
	
}
