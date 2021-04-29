package Lab;

public class SportsCar extends Car
{
    private int TopSpeed;

    public SportsCar(String Make, String Model, int Age, int TopSpeed)
    {
        super(Make, Model, Age);
        this.TopSpeed = TopSpeed;
    }

    public SportsCar()
    {

    }

    public void setTopSpeed(int NewSpeed)
    {
        TopSpeed = NewSpeed;
    }

    public String toString()
    {
        return ("This " + super.Make + " " + super.Model + ", which was built in " + super.Age + ", has has a top speed of " + TopSpeed + " miles per hour.");
    }
}
