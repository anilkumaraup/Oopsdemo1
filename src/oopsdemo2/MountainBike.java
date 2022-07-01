package oopsdemo2;

public class MountainBike extends Bicycle {

	public int seatheight;
	
	public MountainBike(int gear, int speed,int s) {
		super(gear, speed);
		this.seatheight=s;
		
	}
	
	//generate setter for seatheight variable
	public void setSeatheight(int seatheight) {
		this.seatheight = seatheight;
	}

	@Override
	public String toString() {
		
		return super.toString() +"MountainBike [seatheight=" + seatheight + "]";
	}
	
	
	
}
