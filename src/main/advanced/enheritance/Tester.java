package main.advanced.enheritance;

import org.junit.jupiter.api.Test;

public class Tester {


    @Test
    public void test1(){Vehicle plane = new Vehicle("plane",50,"white",300);
        System.out.println(plane);
        plane.info();

    }
    @Test
    public void test2(){Car car = new Car("Audi",5,"red",330);
        System.out.println(car);
        car.info();
        car.info("sport");
        car.color = "black";
        car.seatCapacity = 4;
        car.maxSpeed = 250;
        car.setName(" Ford ");
        System.out.println(car);

    }
    @Test
    public void interface_test(){
        Car porsche = new Car(
                "Porsche",
                2,
                "orange",
                300);
        Drivable.start();
        porsche.drive(50.5f);
        porsche.stop();
        porsche.clean("Premiun");

    }

    public static void main (String[] args) {
        Vehicle plane = new Vehicle("plane",50,"white",300);
        System.out.println(plane);
        plane.info();

        Car car = new Car("Audi",5,"red",330);
        System.out.println(car);
        car.info();
        car.info("sport");
        car.color = "black";
        car.seatCapacity = 4;
        car.maxSpeed = 250;
        car.setName(" Ford ");
        System.out.println(car);

        System.out.println(car.getMessage());
        Car porsche = new Car(
                "Porsche",
                2,
                "orange",
                300);

        porsche.info();
        ((Car)porsche).info("sport");
        System.out.println(porsche);
        System.out.println(((Car)porsche).getMessage());
        System.out.println(
                "Porsche is Object :" + ( porsche instanceof Object));

        System.out.println(
                "Porsche is Vehicle :" + ( porsche instanceof Vehicle));

        System.out.println(
               "Porsche is car :" +  (porsche instanceof Car));
    }
}
