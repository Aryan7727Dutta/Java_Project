package Ride_Invoice_generator;

class Ride {
    double distance;
    int time;
    String rideType;

    Ride(double distance, int time, String rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
}