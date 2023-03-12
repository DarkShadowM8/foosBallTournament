package com.foosball.modelsDTO;

public class MatchAddDto {

//////////////////////////////////////////////////////////////////////////////////////////////////
//												ATTRIBUTES
//////////////////////////////////////////////////////////////////////////////////////////////////

	private Integer team_1_Id;
	private Integer team_2_Id;
	private Long tournamentDto;
	private String location;
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//												GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////

	public Integer getTeam_1_Id() {
		return team_1_Id;
	}
	public void setTeam_1_Id(Integer team_1_Id) {
		this.team_1_Id = team_1_Id;
	}
	public Integer getTeam_2_Id() {
		return team_2_Id;
	}
	public void setTeam_2_Id(Integer team_2_Id) {
		this.team_2_Id = team_2_Id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public Long getTournamentDto() {
		return tournamentDto;
	}
	public void setTournamentDto(Long tournamentDto) {
		this.tournamentDto = tournamentDto;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
//												ToSTRING Method
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Override
	public String toString() {
		return "MatchAddDto [team_1_Id=" + team_1_Id + ", team_2_Id=" + team_2_Id + ", location="
				+ location + "]";
	}
	
}
