import java.util.Scanner;
public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
		System.out.println("");
		
		int randomNo = (int)(Math.random()*100+1);
		Scanner ref = new Scanner(System.in);
		
		boolean playAgain = true;
		int rounds = 0;
		
		while(playAgain)
		{
			rounds++;
			int MaxAttempts = 5;
			int Attempts = 0;
			
			System.out.println("Round "+rounds+" :");
			System.out.println("I have generate a number between 1 and 100. Try to guess it!! ");
			
			while(Attempts<MaxAttempts)
			{
				System.out.print("Enter your Guess: ");
				int userGuess = ref.nextInt();
				Attempts++;
				
				if(userGuess == randomNo)
				{
					System.out.println("Congratulation you guess the correct number!!");
					break;
				}
				else
				{
					if(userGuess > randomNo)
					{
						System.out.println("Your guess is too high!!");
					}
					else
					{
						System.out.println("Your guess is too low!!");
					}
				}
				System.out.println("Attempts Remaining: "+(MaxAttempts - Attempts));
			    }
				
			    System.out.println("The correct Number was: "+randomNo);
			    System.out.println("Would you like to play another round??");
				String r = ref.next();
				playAgain = r.equalsIgnoreCase("yes");
		   }
		System.out.println("Thanks for Playing!!");
	}
}
