package oopsdemo2;
//Java program to illustrate the concept of Single inheritance

public class Bicycle {

	public int gear;
    public int speed;
	
    public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;		
	}
    
    void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

	public void startCycling() 
	{
		gear=gear+1;
		System.out.println("Cycling in Gear No :"+gear);
		
	}
    
    
}
