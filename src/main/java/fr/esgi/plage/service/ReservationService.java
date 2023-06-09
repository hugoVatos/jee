package fr.esgi.plage.service;

import java.util.List;

import fr.esgi.plage.business.Reservation;
import fr.esgi.plage.dto.ReservationDto;

public interface ReservationService {

	Reservation getReservation(Long id);

	List<Reservation> getAllReservations();

	Reservation createReservation(ReservationDto reservation);

	Reservation modifyReservation(ReservationDto reservationDto);

	boolean deleteReservation(Long id);
}
