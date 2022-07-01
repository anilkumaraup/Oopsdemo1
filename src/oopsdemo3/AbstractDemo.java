package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Trainee t1=new Marks("John","New york",1001,35);//up casting
		
		t1.show();//invokes abstract base class method
		double marks=t1.calculateMarks();//invokes sub class method
		System.out.println(t1 +" "+marks);
	}

}
