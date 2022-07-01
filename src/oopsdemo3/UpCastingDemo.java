package oopsdemo3;


class Game
{
        public void play(){
        System.out.println("Game is being played");
        }
        
        public void noOfPlayers(){
        System.out.println("No of players depend upon the game");
        }
        
        public void winner(String name){
        System.out.println("Winner is : " + name);
        }
}

class Cricket extends Game
{
	public void noOfPlayers()
	{
		System.out.println("22");
		
	}
	
	public void teams()
	{
		System.out.println("2");
	}
}

class Chess extends Game
{
	public void noOfPlayers()
	{
		
	}
}
public class UpCastingDemo {
	
	public static void main(String[] args) {
	 
	Game g=new Cricket();
	Game g1=new Chess();

	g.play();
	g.noOfPlayers();
	g.winner("A");
	
	//g.teams();
	
	
	Cricket c =new Cricket();
	c.teams();
	
	g1.play();
	g1.noOfPlayers();
	g1.winner("Kiran");
	
	System.out.println("********************************");
	
	Game g100;
	
	g100=new Cricket();
	g100.play();
	g100.noOfPlayers();
	g100.winner("CSK");
	
	g100=new Chess();
	g100.play();
	g100.noOfPlayers();
	g100.winner("Magnus");
	
	
	System.out.println("***************************");
	
	
	}
	

}