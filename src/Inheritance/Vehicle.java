package Inheritance;

public class Vehicle {
    public String brand;
    private int speed;


    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public void move(){
        System.out.println(brand + " is moving at " + speed + " km/h  ");
    }
}
