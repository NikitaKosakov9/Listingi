package listing_3;

class vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}

class vehicleDemo {
    public static void main(String[] args) {
        vehicle car1 = new vehicle();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup= 30;
        vehicle bus1 = new vehicle();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup= 45;

        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;
        System.out.print("Car1 может проехать за 1 час 15 мин. расстояние в ");
        System.out.print(distanceCar + " км c " + car1.passengers);
        System.out.println(" пассажирами.");
        System.out.print("Bus1 может проехать за 1 час 15 мин. расстояние в ");
        System.out.print(distanceBus + " км c " + bus1.passengers);
        System.out.println(" пассажирами.");
        car1 = null;
    }
}