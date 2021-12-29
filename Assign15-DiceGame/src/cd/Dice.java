package cd;

import java.util.Random;

public class Dice 
{
	int computer_value;
	int user_value;
	int computer_wins;
	int user_wins;
	public void playGame() {
		Random r=new Random();		
		for(int i=1;i<=10;i++) {
			computer_value=1+r.nextInt(6);
			user_value=1+r.nextInt(6);
			System.out.println("Computer value: "+computer_value);
			System.out.println("User value: "+user_value);
			System.out.println("-------------------------------");
			if(computer_value>user_value) {
				System.out.println("In the round: "+i+" computer wins");
				computer_wins++;
			}
			else if(user_value>computer_value) {
				System.out.println("In the round: "+i+" user wins");
				user_wins++;
			}
			else
				System.out.println("In the round: "+i+" Tie ");
		}
		if(computer_wins>user_wins)
			System.out.println("The Final winner is computer");
		else if(user_wins>computer_wins)	
			System.out.println("The Final winner is user");
		else
			System.out.println("Nobody wins, Its a tie");
	}
	public static void main(String[] args) {
		new Dice().playGame();
	}

}
