package exo;

import models.Trip;

import java.util.List;
import java.util.Map;



import java.util.stream.Collectors;

public class Partie2 {

    public Map<String, Long> countByCity(List<Trip> trips) {
        // nb trajets / ville
        //donc groupingBy + counting // ok ?
        return trips.stream()
        
                .collect(Collectors.groupingBy(

                        t -> t.city(),

                        
                        Collectors.counting()
                ))
                ;


    }

    public Map<String, Double> revenueByDriver(List<Trip> trips) {
        // revenu par chauffeur
         //+prix / driver, collectors
        return trips.stream()

                .collect(Collectors.groupingBy(

                        t -> t.driverId(),
                        Collectors.summingDouble(t -> t.price())

                        
                )
        );
    }

    public Map<String, Double> avgDurationByCity(List<Trip> trips) {
        // coder ici
        // durée moyenne par ville
        // averagingD -> durationM moy
        return trips.stream()

                .collect(Collectors.groupingBy(

                        t -> t.city(),

                        Collectors.averagingDouble(t -> t.durationMin())
                
             
                )
        )
                ;

    }


}


