package Lab;

public class Truck extends Car
{

    private int HP;

    public Truck(String Make, String Model, int Age, int HP)
    {
        super(Make, Model, Age);
        this.HP = HP;
    }

    public void setHorsePower(int NewHorsePower)
    {
        HP = NewHorsePower;
    }

    public String toString()
    {
        return ("This " + super.Make + " " + super.Model + ", which was built in " + super.Age + ", has " + HP + " horsepower.");
    }
}
