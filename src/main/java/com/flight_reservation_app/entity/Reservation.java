package com.flight_reservation_app.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Reservation extends AbstractEntity{

	private boolean checkedIn;
	private int numberOfBags;
	
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
}
