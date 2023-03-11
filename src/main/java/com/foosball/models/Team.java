package com.foosball.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Team {
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//										Fields
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true)
	private String name;
	
//	@OneToOne
//	@JoinColumn(name = "team_captain")
//	private Captain captain;
	
//	@OneToMany (mappedBy = "team")
//	private List<Player> playerList = new ArrayList<>();

	
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

//	public Captain getCaptain() {
//		return captain;
//	}
//
//	public void setCaptain(Captain captain) {
//		this.captain = captain;
//	}

//	public List<Player> getPlayerList() {
//		return playerList;
//	}
//
//	public void setPlayerList(List<Player> playerList) {
//		this.playerList = playerList;
//	}
	
	
}
