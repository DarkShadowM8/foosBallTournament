package com.foosball.modelsDTO;

public class MatchAddDto {

//////////////////////////////////////////////////////////////////////////////////////////////////
//												ATTRIBUTES
//////////////////////////////////////////////////////////////////////////////////////////////////

	private Long team_1_Id;
	private Long team_2_Id;
	private Long tournamentDto;
	private String location;
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//												GETTERS & SETTERS
//////////////////////////////////////////////////////////////////////////////////////////////////

	public Long getTeam_1_Id() {
		return team_1_Id;
	}
	public void setTeam_1_Id(Long team_1_Id) {
		this.team_1_Id = team_1_Id;
	}
	public Long getTeam_2_Id() {
		return team_2_Id;
	}
	public void setTeam_2_Id(Long team_2_Id) {
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
