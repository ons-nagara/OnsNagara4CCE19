package tn.esprit.onsnagara4cce19.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.onsnagara4cce19.Domain.Reservation;
import tn.esprit.onsnagara4cce19.Services.Impls.ReservationService;

import java.util.List;

@Tag(name = "Gestion des réservations", description = "CRUD de l'entité Reservation")
@RequiredArgsConstructor
@RequestMapping("/reservations")
@RestController
public class ReservationRestController {
    private final ReservationService reservationService;

    @Operation(summary = "Récupérer la liste complète des réservations")
    @GetMapping
    public List<Reservation> findAll() {
        return reservationService.getAllReservations();
    }

    @Operation(summary = "Récupérer une réservation par son identifiant")
    @GetMapping("/{id}")
    public Reservation findById(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @Operation(summary = "Ajouter une réservation")
    @PostMapping
    public Reservation create(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @Operation(summary = "Modifier une réservation")
    @PutMapping
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @Operation(summary = "Supprimer une réservation par son identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}