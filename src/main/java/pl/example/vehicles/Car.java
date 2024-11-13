package pl.example.vehicles;

public class Car extends Vehicle {
public int doors;

    public Car(String name, int doors) {
        super(name);
        this.doors = doors;
    }

    int getDoors(){
        return doors;
    }

    @Override
    public int getMaxSpeed(){
        return 200;
    }

}
