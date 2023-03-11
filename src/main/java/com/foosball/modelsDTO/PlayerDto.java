package com.foosball.modelsDTO;

import com.foosball.enumerations.PlayerStatus;

public class PlayerDto {

//////////////////////////////////////////////////////////////////////////////////////////////////
//										FIELDS
//////////////////////////////////////////////////////////////////////////////////////////////////

	private Long id;
	private String firstName, lastName;
	private PlayerSkillCardDto playerSkills;
	private Integer cnic;
	private TeamDto team;
	private PlayerStatus status;

//////////////////////////////////////////////////////////////////////////////////////////////////
//										CONSTRUCTOR
//////////////////////////////////////////////////////////////////////////////////////////////////

	public PlayerDto(){
		this.status = status.Player;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//										GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}
	public PlayerStatus getStatus() {
		return status;
	}
	public void setStatus(PlayerStatus status) {
		this.status = status;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCnic() {
		return cnic;
	}
	public void setCnic(Integer cnic) {
		this.cnic = cnic;
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
	public PlayerSkillCardDto getPlayerSkills() {
		return playerSkills;
	}
	public void setPlayerSkills(PlayerSkillCardDto playerSkills) {
		this.playerSkills = playerSkills;
	}
	public TeamDto getTeam() {
		return team;
	}
	public void setTeam(TeamDto team) {
		this.team = team;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//										ToSring METHOD
//////////////////////////////////////////////////////////////////////////////////////////////////

	public String toString() {
		return "PlayerDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", playerSkills="
				+ playerSkills + ", cnic=" + cnic + ", team=" + team + ", status=" + status + "]";
	}
	
}
//private CaptainDto captain;


//public CaptainDto getCaptain() {
//	return captain;
//}
//public void setCaptain(CaptainDto captain) {
//	this.captain = captain;
//}
