package oopsdemo2;

public class CandidateTest {

	public static void main(String[] args) {
	
		Javacandidate jc1=new Javacandidate(1111, "Gavin King", 5000, "Hibernate");
        jc1.display();
        jc1.getPerks();

        AccountsCandidate ac1=new AccountsCandidate(2222, "Mike John", 3000);
        ac1.display();
        ac1.getPerks();
	}

}
