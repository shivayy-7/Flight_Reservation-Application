package com.flight_reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_reservation_app.dto.ReservationRequest;
import com.flight_reservation_app.entity.Reservation;
import com.flight_reservation_app.services.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/completeReservation")
	public String confirmReservation(ReservationRequest request, Model model) {
		Reservation reservationId = reservationService.bookFlight(request);
		model.addAttribute("reservationId", reservationId.getId());
		
		
		return "confirmReservation";
	}

}
