package com.flight_reservation_app.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class User extends AbstractEntity{
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	

}
