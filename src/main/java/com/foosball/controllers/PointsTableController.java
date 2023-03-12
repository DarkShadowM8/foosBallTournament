package com.foosball.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foosball.services.interfaces.PointsTableService;

@RestController
@RequestMapping("/points-table")
public class PointsTableController {
	
	@Autowired
	private PointsTableService pointsTableService;
	
	@GetMapping(value = "/get")
	public ResponseEntity get() {
		return new ResponseEntity(pointsTableService.getPointsTable(), HttpStatus.FOUND);
	}
}
