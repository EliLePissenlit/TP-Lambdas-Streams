import factory.TripFactory;
import models.Trip;
import exo.Partie1;
import exo.Partie2;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        //10 traj)
        List<Trip> trips = TripFactory.generateTrips(10);

        // p 1
        Partie1 p1 = new Partie1();
        List<Trip> r1 = p1.longAndExpensiveTrips(trips);
        List<Trip> r2 = p1.badTrips(trips);
        List<Trip> r3 = p1.recentTrips(trips);

        System.out.println("nb trips=" + trips.size()
                + " long+cher=" + r1.size()
                + " mauvais=" + r2.size()
                + " recent=" + r3.size());

        // ^p 2 stats
        Partie2 p2 = new Partie2();
        System.out.println("/ v=" + p2.countByCity(trips));
        System.out.println("$ driver " + p2.revenueByDriver(trips));
        System.out.println("tmp moy / ville=" + p2.avgDurationByCity(trips));
    }
}