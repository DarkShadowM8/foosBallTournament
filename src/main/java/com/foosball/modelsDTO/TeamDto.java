package com.foosball.modelsDTO;

import java.util.ArrayList;
import java.util.List;

import com.foosball.models.Player;

public class TeamDto {

//////////////////////////////////////////////////////////////////////////////////////////////////
//										ATTRIBUTES
//////////////////////////////////////////////////////////////////////////////////////////////////

	private Long id;
	private String name;
	
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
}
//private Integer captainID;
//public Integer getCaptain() {
//return captainID;
//}
//public void setCaptain(Integer captainID) {
//this.captainID = captainID;
//}