package com.foosball.models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Finals implements Serializable{

//////////////////////////////////////////////////////////////////////////////////////////////////
//Fields
//////////////////////////////////////////////////////////////////////////////////////////////////

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
}
