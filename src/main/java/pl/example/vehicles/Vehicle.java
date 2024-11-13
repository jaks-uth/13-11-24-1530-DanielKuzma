package pl.example.vehicles;

public abstract class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public int getMaxSpeed(){
        return 0;
    };

    String getName(){
     return name;
    }
}
