package com.foosball.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foosball.modelsDTO.TournamentDto;
import com.foosball.services.interfaces.TournamentService;

@RestController
public class TournamentController {

	@Autowired
	private TournamentService tournamentService;
	
	@PostMapping("/tournament/add")
	public ResponseEntity<Object> createTournamentData(@RequestBody TournamentDto tournamentDTO){
		tournamentService.addTournament(tournamentDTO);
		return new ResponseEntity<>("tournament has been added", HttpStatus.CREATED);
	}
	
	@GetMapping("/tournaments")
	public ResponseEntity<Object> getAllData(){
		return new ResponseEntity<>(tournamentService.getAll(), HttpStatus.FOUND);
	}
	
	@DeleteMapping("/tournament/delete")
	public ResponseEntity<Object> deleteTournamentData(@RequestBody TournamentDto tournamentDTO){
		tournamentService.deleteTournament(tournamentDTO);
		return new ResponseEntity<>("tournament has been deleted", HttpStatus.OK);
	}
}
