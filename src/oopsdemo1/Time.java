package oopsdemo1;

/* Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55
 * t2 --> 10 : 30 :30
 *        23 : 16 :25
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */

public class Time {
	
	private int hours;
	private int min;
	private int sec;
	int c;
	
	public Time(int hours, int min, int sec) {
		this.hours = hours;
		this.min = min;
		this.sec = sec;
	}


	void addTime(Time t2) {
		sec=this.sec+t2.sec;
		sec=returnValue(sec);
		min=this.min+t2.min+c;
		min=returnValue(min);
		hours=this.hours+t2.hours+c;
	}

	int returnValue(int n) {
		c=0;
		if(n<60) {
			return n;
		}
		else if(n>=60 && n<120) {
			c++;
			return n-60;
		}
		else {
			c+=2;
			return 120-n;
		}
	}
	
	void display() {
		System.out.printf("final added time is: %d : %d : %d",hours,min,sec).println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//>120
		Time t1=new Time(12, 60, 60);
		Time t2=new Time(10, 58, 60);
		t1.addTime(t2);
		t1.display();
		
		//60<=t<120
		Time t3=new Time(12, 45, 55);
		Time t4=new Time(10, 30, 30);
		t3.addTime(t4);
		t3.display();
		
		//less than 60
		Time t5=new Time(2, 15, 30);
		Time t6=new Time(3, 30, 25);
		t5.addTime(t6);
		t5.display();
		

	}


	public void add(Time t2) {
		// TODO Auto-generated method stub
		
	}

}
