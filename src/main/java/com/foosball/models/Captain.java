//package com.foosball.models;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Captain {
//	
////////////////////////////////////////////////////////////////////////////////////////////////////
////											Fields
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
//	
//	@OneToOne
//	@JoinColumn(name = "player_id")
//	private Player player;
//	
//	@OneToOne(mappedBy = "captain")
//	private Team team;
//
////////////////////////////////////////////////////////////////////////////////////////////////////
////										GETTERS & SETTERS
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public Player getPlayer() {
//		return player;
//	}
//
//	public void setPlayer(Player player) {
//		this.player = player;
//	}
//
//	public Team getTeam() {
//		return team;
//	}
//
//	public void setTeam(Team team) {
//		this.team = team;
//	}
//
//}
////	private String userName;
////	
////	@Column(name = "password")
////    private String password;
////	
////	
////	
////	public void setPassword(String password) {
////        PasswordEncoder encoder = new BCryptPasswordEncoder();
////        String hashedPassword = encoder.encode(password);
////        this.password = hashedPassword;
////    }
////    
////    public boolean checkPassword(String password) {
////        PasswordEncoder encoder = new BCryptPasswordEncoder();
////        return encoder.matches(password, this.password);
////    }
//
