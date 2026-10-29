package tn.esprit.onsnagara4cce19.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Reservation;
import tn.esprit.onsnagara4cce19.Services.Impls.ReservationService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/reservations")
@RestController
public class ReservationRestController {
    private final ReservationService reservationService;

    @PostMapping
    public Reservation add(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation get(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @PutMapping
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @GetMapping
    public List<Reservation> getAll() {
        return reservationService.getAllReservations();
    }
}