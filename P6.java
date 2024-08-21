class Vehicle{
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void getter(){
        System.out.println(" Vehicle Make: " + make);
        System.out.println(" Vehicle Model: " + model);
        System.out.println(" Vehicle Manufacture Year: " + year);
    }
}

class Car extends Vehicle{
    int trunkSize;
    Car(String make, String model, int year, int trunkSize){
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    void getter(){
        System.out.println(" Car Make: " + make);
        System.out.println(" Car Model: " + model);
        System.out.println(" Car Manufacture Year: " + year);
        System.out.println(" Car Trunk Size (m^3):" + trunkSize);
    }

}

class Truck extends Vehicle{

    int payloadCapacity;
    Truck(String make, String model, int year, int payloadCapacity){
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    void getter(){
        System.out.println(" Truck Make: " + make);
        System.out.println(" Truck Model: " + model);
        System.out.println(" Truck Manufacture Year: " + year);
        System.out.println(" Truck Payload Capacity (Kgs):" + payloadCapacity);
    }

}

public class P6 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Ford", "Mustang", 2021, 13);
        v1.getter();

        System.out.println();

        Vehicle v2 = new Truck("Ford", "F-150", 2021, 2000);
        v2.getter();
    }
    
}
