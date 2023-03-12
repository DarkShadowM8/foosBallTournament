package com.foosball.modelsDTO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.foosball.models.Player;
import com.foosball.models.Tournament;

public class TeamDto {

//////////////////////////////////////////////////////////////////////////////////////////////////
//										ATTRIBUTES
//////////////////////////////////////////////////////////////////////////////////////////////////

	private Long id;
	private String name;
	
	private Long tournament;
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//										GETTERS & SETTERS
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
	@Override
	public String toString() {
		return "TeamDto [id=" + id + ", name=" + name + "]";
	}
	public Long getTournament() {
		return tournament;
	}
	public void setTournament(Long tournament) {
		this.tournament = tournament;
	}
	
	
}
//private Integer captainID;
//public Integer getCaptain() {
//return captainID;
//}
//public void setCaptain(Integer captainID) {
//this.captainID = captainID;
//}