import factory.TripFactory;
import models.Trip;
import exo.Partie1;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        // test partie 1
        List<Trip> trips = TripFactory.generateTrips(10);

        Partie1 p1 = new Partie1();

        List<Trip> r1 = p1.longAndExpensiveTrips(trips);
        List<Trip> r2 = p1.badTrips(trips);
        List<Trip> r3 = p1.recentTrips(trips);

        System.out.println("nb trips=" + trips.size()
                + " long+cher=" + r1.size()
                + " mauvais=" + r2.size()
                + " recent=" + r3.size());
    }
}