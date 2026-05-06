package exo;

import models.Trip;

import java.util.Comparator;
import java.util.List;

// pour optional
import java.util.Optional;

import java.util.stream.Collectors;

public class Partie3 {



        // comparators (

    Comparator<Trip> byPrice = Comparator.comparingDouble(t -> t.price());

    Comparator<Trip> byRating = Comparator.comparingDouble(t -> t.rating());


    public List<Trip> top10ExpensiveTrips(List<Trip> trips) {
        // top 10 des plus chers


        // tri par prix desc puis on prend 10
        return trips.stream()

                .sorted(byPrice.reversed())


                .limit(10)
                .collect(Collectors.toList());
    
    
            }

    public Optional<Trip> bestTrip(List<Trip> trips) {


        // max par rating, collectors
        return trips.stream()
                .max(byRating);

                
    }
}
