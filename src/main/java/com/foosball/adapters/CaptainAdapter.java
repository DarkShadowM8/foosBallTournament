//package com.foosball.adapters;
//
//import com.foosball.models.Captain;
//import com.foosball.modelsDTO.CaptainDto;
//
//public class CaptainAdapter {
//	
//	PlayerAdapter playerAdapter = new PlayerAdapter();
//	public CaptainDto _toDto (Captain captain) {
//		CaptainDto captainDto = new CaptainDto();
//		captainDto.setId(captain.getId());
//		captainDto.setPlayerDto(null);
//		return captainDto;
//	}
//	
//	public Captain _toDao (CaptainDto captainDto) {
//		
//		Captain captain = new Captain();
//		captain.setPlayer(playerAdapter._toDao(captainDto.getPlayerDto()));
//		
//		return captain;
//	}
//}
