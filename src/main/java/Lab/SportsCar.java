package Lab;

class SportsCar extends Car{
    public int rideheight;

    public SportsCar(int gear, int speed, int darideheight){
        super(gear,speed);
        rideheight = darideheight;
    }
    @Override public String toString(){
        return(super.toString() + "ride height is " + rideheight + " inches");
    }
}
