package Lab;

class Car{
    public int gear;
    public int speed;

    public Car(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public String toString(){
        return ("Number of gears is " + gear + "\n" + "speed of car is " + speed + "\n");
    }
}