package Inheritance;

public class Bike extends Vehicle {
    public Bike(String brand,int speed){
        super(brand,speed);
    }
    public void wheelie(){
        System.out.println(brand + "honk ");
    }
    //polymorphism
    @Override
    public void move(){
        System.out.println(brand + " is racing fastly at  " + getSpeed() + " km/h");
    }
}