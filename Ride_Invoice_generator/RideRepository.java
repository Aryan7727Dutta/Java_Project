package Ride_Invoice_generator;

import java.util.*;

class RideRepository {
    private final Map<String, List<Ride>> rideData = new HashMap<>();
    RideRepository() {
        addRide("User_1", new Ride(2.5, 45, "Normal"));
        addRide("User_1", new Ride(6.0, 90, "Normal"));
        addRide("User_2", new Ride(4.2, 60, "Premium"));
        addRide("User_2", new Ride(3.8, 40, "Normal"));
        addRide("User_2", new Ride(7.5, 110, "Premium"));
        addRide("User_3", new Ride(1.0, 30, "Normal"));
        addRide("User_4", new Ride(8.5, 100, "Normal"));
        addRide("User_4", new Ride(5.2, 75, "Premium"));
        addRide("User_4", new Ride(0.8, 35, "Normal"));
        addRide("User_5", new Ride(9.0, 120, "Premium"));
        addRide("User_5", new Ride(2.3, 50, "Normal"));
    }
    public void addRide(String userId, Ride ride) {
        rideData.computeIfAbsent(userId, k -> new ArrayList<>()).add(ride);
    }
    public List<Ride> getRides(String userId) {
        return rideData.getOrDefault(userId, Collections.emptyList());
    }
    public Set<String> getAllUsers() {
        return rideData.keySet();
    }
}