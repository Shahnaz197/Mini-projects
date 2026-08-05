package Inheritance;

public class Car extends Vehicle {
    public Car(String brand,int speed){
        super(brand,speed);
    }
    public void honk (){
        System.out.println(brand + " beep  ");

    }
    //polymorphism
    @Override
    public void move(){
        System.out.println(brand + "is driving smoothly at " + getSpeed() + " km/h");
    }
}