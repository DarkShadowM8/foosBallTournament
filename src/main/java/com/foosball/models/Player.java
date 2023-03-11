package com.foosball.models;

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

import com.foosball.enumerations.PlayerStatus;

@Entity
@Table(name = "players")
public class Player {

//////////////////////////////////////////////////////////////////////////////////////////////////
//										Fields
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private Integer cnic;

	@Enumerated(EnumType.STRING)
	private PlayerStatus status;
	
	@ManyToOne
	@JoinColumn(name = "Team", referencedColumnName = "name")
	private Team team;

	@OneToOne (cascade = CascadeType.ALL,orphanRemoval = true )
	@JoinColumn(name = "Skills", referencedColumnName = "id")
	private PlayerSkillCard playerSkills;
	
//	@OneToOne (mappedBy = "player")
//	private Captain captain;

	//Constructor
//	public Player(){
//		this.status = status.Player;
//	}
//	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//									GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public PlayerStatus getStatus() {
		return status;
	}
	public void setStatus(PlayerStatus status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public PlayerSkillCard getPlayerSkills() {
		return playerSkills;
	}
	public void setPlayerSkills(PlayerSkillCard playerSkills) {
		this.playerSkills = playerSkills;
	}
	public Integer getCnic() {
		return cnic;
	}
	public void setCnic(Integer cnic) {
		this.cnic = cnic;
	}	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}

//public Captain getCaptain() {
//		return captain;
//	}
//
//	public void setCaptain(Captain captain) {
//		this.captain = captain;
//	}

}