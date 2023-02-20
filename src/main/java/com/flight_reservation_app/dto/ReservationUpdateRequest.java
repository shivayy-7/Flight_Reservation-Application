package com.flight_reservation_app.dto;

import lombok.Data;

@Data
public class ReservationUpdateRequest {

	private long id;
	private boolean checkedIn;
	private int numberOfBags;
}
