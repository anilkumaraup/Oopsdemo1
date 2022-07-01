package oopsdemo2;

public class Javacandidate extends Candidate {

	private String tech;
    private double perks;
    
	public Javacandidate(int id, String name, double salary, String t) {
		super(id, name, salary);
		this.tech = t;		
	}
    
	void getPerks()
    {
        perks= salary*.10;
        System.out.println("Perks of Java Candidate is :"+perks);
    }

    void display()
    {
        super.display();
        System.out.println(tech);
    }
    
}
