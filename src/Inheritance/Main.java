package Inheritance;

public class Main {
    public static void main(String[] args) {
            Car c = new Car("Benz", 180);
            c.move();   // from Vehicle ✅
            c.honk();   // from Car ✅

            Bike b = new Bike("Ducati", 200);
            b.move();     // from Vehicle ✅
            b.wheelie();  // from Bike ✅

    }

}

/*
public class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed); // ✅ calls Vehicle constructor!
    }

    public void honk() {
        System.out.println(brand + " beep beep!");
    }
}

public class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed); // ✅ calls Vehicle constructor!
    }

    public void wheelie() {
        System.out.println(brand + " doing a wheelie!"); // ❌ you put "honk" here!
    }
}


// ❌ your version — no constructor call
Car c = new Car();
c.brand = "Benz";
c.setSpeed(180);

// ✅ correct — use constructor
Car c = new Car("Benz", 180);
Bike b = new Bike("Ducati", 200);
 */