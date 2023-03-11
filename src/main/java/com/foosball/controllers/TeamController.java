package com.foosball.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foosball.modelsDTO.TeamDto;
import com.foosball.services.interfaces.TeamService;

@RestController
//@RequestMapping("/team")
public class TeamController {

	@Autowired
	TeamService teamService;

	@PostMapping("/team/add")
	public ResponseEntity<Object> addData(@RequestBody TeamDto teamDto) {
		teamService.add(teamDto);
		return new ResponseEntity<>("New team has been added", HttpStatus.CREATED);
	}
	
	@GetMapping("/team/get-all")
	public ResponseEntity<Object> getAllData(){
		return new ResponseEntity<>(teamService.getAll(), HttpStatus.FOUND);
	}
	
//	@DeleteMapping("/delete")
//	public ResponseEntity<Object> deleteData(@RequestBody TeamDto teamDto){
//		teamService.delete(teamDto);
//	}
}
