package ie.atu.sw;

public class GuessGame {
	private Player p1;
	private Player p2; //three instance variables of player
	private Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player(); //creates three players
		p3 = new Player();
		
		int guessPlayer1 = 0;
		int guessPlayer2 = 0; //making guess variables
		int guessPlayer3 = 0;
		
		boolean Player1IsRight = false;
		boolean Player2IsRight = false;
		boolean Player3IsRight = false;
		
		int targetNumber =(int) (Math.random() * 10); //generates random number for players to guess
		System.out.println("Let's play a game! I'm thinking of number between 0 and 9..." );
		
		
		// loop until one of the players guesses the target number correctly
		while(true) {  
			System.out.println("Number to guess is " + targetNumber);
			
			p1.guess();
			p2.guess(); //each player try to guess
			p3.guess();
			
			// this is each player guess and print to the console
			guessPlayer1 =p1.getNumber();
			System.out.println("This is Player 1 guess " + guessPlayer1);
			guessPlayer2 =p2.getNumber(); 
			System.out.println("This is Player 2 guess " + guessPlayer2);
			guessPlayer3 =p3.getNumber();
			System.out.println("This is Player 3 guess " + guessPlayer3);
			
			//check if any player guessed the target number
			
			if (guessPlayer1 == targetNumber) {
				Player1IsRight = true;
			}
			if (guessPlayer2 == targetNumber) {
				Player2IsRight = true;
			}
			if (guessPlayer3 == targetNumber) {
				Player3IsRight = true;
			}
			
			
			//second If statement to check do we have a winner or players need to guess again
			
			if (Player1IsRight || Player2IsRight || Player3IsRight) {
				System.out.println("We have a winner!!!");
				System.out.println("Player 1 got it right? " +Player1IsRight);
				System.out.println("Player 2 got it right? " +Player2IsRight);
				System.out.println("Player 3 got it right? " +Player3IsRight);
				System.out.println("Game is completed!");
				
				break; //end of loop
			}else {
			System.out.println("No winners,we have to try again."); //loop continues
			}
		}
		
		
	}
	
	
	
}
