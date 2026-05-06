package exo;

import models.Trip;

// pour date de today et yesterday
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Partie1 {

    public List<Trip> longAndExpensiveTrips(List<Trip> trips) {
        // distance > 10km et prix > 20€

        // stream ok
        return trips.stream()
                .filter(t -> t.distanceKm() > 10)
                .filter(t -> t.price() > 20)
                .collect(Collectors.toList());
    }

    public List<Trip> badTrips(List<Trip> trips) {
        // rating < 3

        //ok
        return trips.stream()
                .filter(t -> t.rating() < 3)
                .collect(Collectors.toList());
    }

    public List<Trip> recentTrips(List<Trip> trips) {
        // aujourd’hui ou hier
        LocalDate ajd = LocalDate.now();


        //ocaldate now et minusDays pour enlever jour 

        LocalDate hier = ajd.minusDays(1);

        return trips.stream()
                .filter(t -> {
                    LocalDate d = t.startTime().toLocalDate();
                    return d.equals(ajd) || d.equals(hier);
                }
            )

         
         
         
            .collect(Collectors.toList());
    }


}
