package basics;
///code to calculate whether each student in the class,
//excluding Lucy, has passed their recent test
public class CalculateTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] students = {"Mark", "Bill", "Lucy", "Chloe"};
	     int grades[] = {16, 25, 0, 19};

	     for (int i = 0; i < students.length; ++i) 
	     {
	    	 if (students[i].equals("Lucy")) {	// compare 2 strings
	             continue;
	         }
	         if (grades[i] > 17) {
                System.out.println(students[i] + " has passed their test with the grade " + grades[i] + ".");
             } else {
	            System.out.println(students[i] + " has failed their test with the grade " + grades[i] + ".");
	         }
	        }
	}

}
