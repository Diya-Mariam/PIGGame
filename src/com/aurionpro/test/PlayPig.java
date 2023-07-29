package com.aurionpro.test;
import java.util.*;

public class PlayPig {

	public static void main(String[] args) {

		int totalPoints=0, points=0;
		final int lostPoints=0;
		int turns=1;
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n============================================");
			System.out.println("\nStarting turn "+turns);
			points = 0;
			
			do
			{
				
				System.out.println("\nRoll or Hold..?");
				String decision= sc.next();
				
				if(decision.equalsIgnoreCase("hold"))
				{
					break;
				}
				else if(decision.equalsIgnoreCase("Roll"))
				{
					num = performRollOperation();
					if(num==1)
					{
						points =0;
					}
					else
					{
						points += num;
					}
				}
				else
				{
					System.out.println("Invalid command");
				}
				
			}while(num!=1);	
			
			
			
			if(num==1)
			{
				System.out.println("\nPoints earned in this turn is "+lostPoints);

			}
			else
			{
				System.out.println("\nPoints earned in this turn is "+points);
				
			}
			
			totalPoints += points;
			System.out.println("Total points earned is "+totalPoints);

			
			if(totalPoints >=20)
			{
				System.out.println("\nYou finished in " +turns+ " turns!");
				System.out.println("Congratulations!!");
				break;
			}
			
			turns += 1;
		}
		
		
	}
	
	public static int performRollOperation()
	{
		System.out.println("Performing roll operation..");
		
		int num = getRandomNumberUsingNextInt(1,7);
		
		System.out.println("Number appeared in the dice is "+num);
		
		return num;
	}

	public static int getRandomNumberUsingNextInt(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
	
}








