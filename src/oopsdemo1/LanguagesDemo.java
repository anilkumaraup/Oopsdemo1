package oopsdemo1;
//Program to demonstrate constructors in Java
class Language
{	
	private String s;
	private int version;
	
	Language() //Implicit /No - Args Constructor
	{
		System.out.println("Iam a Implicit Constructor");
		s="Python";
		System.out.println("Hello from :"+s);
	}
	
	Language(String lang) //Parameterized Constructor with 1 Args
	{
		System.out.println("Iam a Prameterized Constructor");
		this.s=lang;
		System.out.println("Hello From :"+s);
	}
	
	Language(String lang,int ver)// Parameterized Constructor with 2 Args
    {
        System.out.println("Iam a Parameterized Constructor with 2  Arguements");
        this.s=lang;
        this.version=ver;
        System.out.println("Hello from : "+s+" V."+version);
    }
}
public class LanguagesDemo {

	public static void main(String[] args) {
		
		Language l1=new Language(); //automatically invokes Implicit Constructor
		Language l2=new Language(); 
		
		Language l3=new Language("Ruby"); //automatically invokes Parameterized Constructor
		Language l4=new Language("Scala");
		Language l5=new Language("Java",2); //automatically invokes 2 Args Parameterized Constructor
  }
}
