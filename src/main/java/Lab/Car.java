package Lab;

import java.util.ArrayList;

public class Car
{
    static int LotSize;

    String Make;
    String Model;
    int Age;

    public Car(String Make, String Model, int Age)
    {
        this.Make = Make;
        this.Model = Model;
        this.Age = Age;

        LotSize++;
    }

    public Car()
    {

    }
}

class Driver
{
    public static void main(String [] args)
    {
        ArrayList<Car> Cars = new ArrayList<>();

        SportsCar Cayman = new SportsCar("Porsche", "Cayman", 2018, 155);
        Cars.add(Cayman);
        SportsCar M4 = new SportsCar("BMW", "M4", 2016, 145);
        Cars.add(M4);
        Cayman.setTopSpeed(145);
        Truck Gladiator = new Truck("Jeep", "Gladiator", 2020, 285);
        Cars.add(Gladiator);

        for (int I = 0; I < Cars.size(); I++)
        {
            System.out.println(Cars.get(I));
        }
        System.out.println("The total amount of cars currently in the lot is " + Car.LotSize + " cars.");
    }
}