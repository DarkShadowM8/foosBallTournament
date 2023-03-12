package com.foosball.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foosball.models.PointsTable;
import com.foosball.repositories.PointsTableRepository;
import com.foosball.services.interfaces.PointsTableService;

@Service
public class PointsTableServiceImpl implements PointsTableService{
	
	@Autowired
	PointsTableRepository pointsTableRepository;
	
	public List<PointsTable> getPointsTable(){
		List<PointsTable> pointsTable = pointsTableRepository.findAll();
		return pointsTable;
	}
}
