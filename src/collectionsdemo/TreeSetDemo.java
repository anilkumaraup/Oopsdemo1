package collectionsdemo;

import java.util.TreeSet;

//Treeset sorts elements in ascending order by default
public class TreeSetDemo {

	public static void main(String[] args) {
		
		// Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");
       
        TreeSet<Integer> tset2=new TreeSet<>();
        
        tset2.add(222);
        tset2.add(107);
        tset2.add(22);
        tset2.add(0);
        tset2.add(3);
        tset2.add(7);

        System.out.println(tset2);

	}

}
