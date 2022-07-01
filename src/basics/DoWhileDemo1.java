package basics;
//Java Program to display Multiplication Table

public class DoWhileDemo1 {

	public static void main(String[] args) {
		
		int row,coloum;
		
		System.out.println("******Multiplication Table*****\n");
		
		row=1;
		do {
			coloum=1;
			do {
				int mul=row*coloum;
				System.out.println(mul+"\t");
				
				coloum=coloum+1;
			}while(coloum <=5);
			
			System.out.println();
			row=row+1;
		}while(row <=5);
	}

}
