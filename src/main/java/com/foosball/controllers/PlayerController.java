package com.foosball.controllers;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foosball.models.Player;
import com.foosball.modelsDTO.PlayerDto;
import com.foosball.services.interfaces.PlayerService;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/player")
public class PlayerController {
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//								AUTOWIRED BEANS
//////////////////////////////////////////////////////////////////////////////////////////////////

	@Autowired
	public PlayerService playerService;

//////////////////////////////////////////////////////////////////////////////////////////////////
//								POST MAPPINGS
//////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping(value = "/save")
	public ResponseEntity post(@RequestBody PlayerDto playerDto) {
		return new ResponseEntity(playerService.add(playerDto), HttpStatus.OK);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////
//								GET MAPPINGS
//////////////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/get")
	public ResponseEntity get() {
		return new ResponseEntity(playerService.getAll(), HttpStatus.OK);
//		return new ResponseEntity("ada", HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity findById(@PathVariable Long id) {
		return new ResponseEntity(playerService.findById(id), HttpStatus.OK);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
//								DELETE MAPPINGS
//////////////////////////////////////////////////////////////////////////////////////////////////

	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteById(@PathVariable Long id) {
		return new ResponseEntity(playerService.deleteById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete_all")
	public ResponseEntity deleteAll() {
		return new ResponseEntity(playerService.deleteAll(), HttpStatus.OK);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
//								PUT/UPDATE MAPPINGS
//////////////////////////////////////////////////////////////////////////////////////////////////

	@PutMapping("/update_player")
	public ResponseEntity update(@RequestBody PlayerDto playerDto) {
		return new ResponseEntity(playerService.update(playerDto), HttpStatus.OK);
	}
}
