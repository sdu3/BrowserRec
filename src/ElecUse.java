
import java.util.Scanner;

public class ElecUse
{
	public static void main(String[] args)
	{
		//computer cost based on user input from question 1
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cost of your candidate computer:");
		int comCost = scan.nextInt();

		//electricity cost based on size of screen 
		System.out.println("Enter the size of screen in inches (please enter an integer): ");
		int screenSize = scan.nextInt();
		
		//electricity cost based on size of hard disk
		System.out.println("Enter the size of hard disk in inches (please enter either 2.5 or 3.5): ");
		double diskSize = scan.nextDouble();
		
		//taking in how long the user will use the computer
		System.out.println("How many years do you expect to keep your computer? (please enter an integer) ");
		int years = scan.nextInt();
		int months = years*12;
		System.out.println("On average, how many hours a day do you leave the power on? (please enter an integer) ");
		int hours = scan.nextInt();
		
		//considering mouse battery
		boolean mouse=false;
		System.out.println("Does your mouse need a battery? (enter no if you don't have a mouse): ");
		//problem: accurately calculates mBattery but does not allow user input, 
		//thus this doesn't work for a user without a mouse
		String yn = scan.nextLine();
		if (yn=="yes")
		{
			mouse=true;
		}
		
		int mBattery;
		mBattery=0;
	
		if (mouse=true)
		{
			mBattery=2*(months-2);
			if (mBattery<=0)
			{
				mBattery=0;
			}
			System.out.println(mBattery);
		}
		 
		//calculating battery cost (cBattery currently non-existent)
		double bCost = mBattery + cBattery;
		
		//calculating total cost (eCost currently non-existent)
		double totalCost = comCost + eCost + bCost;
		
		//final print statements to display answers
		System.out.println("Computer cost = " + comCost);
		System.out.println("Electricity cost = " + eCost);
		System.out.println("Battery cost = " + bCost);
		System.out.println("Total cost = " + totalCost);
	}
	
	public int CpuSpeedCore(String CPUspeed, int numberCores, String CPUbrand)
	{
		int CpuSpeedCore;
		if (speed="low" && cores=2 && brand="Intel") {
			then CpuSpeedCore=55;
		}
		return CpuSpeedCore;
	}

}
