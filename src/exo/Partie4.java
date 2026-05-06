package exo;

import models.Trip;

import java.util.List;
import java.util.Map;



import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Partie4 {

    // lambdas () réutilise streams sinon -points


    ToDoubleFunction<Trip> prix = t -> t.price();

    Function<Trip, String> ville = t -> t.city();
    Predicate<Trip> premium = t -> t.price() > 30 && t.rating() > 4;


    public double totalRevenueSequential(List<Trip> trips) {
        // stream()
        return trips.stream()
                .mapToDouble(prix)
                .sum();
    }



    public double totalRevenueParallel(List<Trip> trips) {
        // parallelStream()
        return trips.parallelStream()
                .mapToDouble(prix)

        
        
        
                .sum();

    }


    public Map<String, Long> countByCityParallel(List<Trip> trips) {
        // coder ici
        return trips.parallelStream()
        
                .collect(Collectors.groupingByConcurrent(
                        ville,


                        Collectors.counting()
                
                    )
                )
                
                ;


    }

    public List<Trip> premiumTripsParallel(List<Trip> trips) {
        // prix > 30 et rating > 4
        return trips.parallelStream()


                .filter(premium)
                .collect(Collectors.toList());
                
    }


}
