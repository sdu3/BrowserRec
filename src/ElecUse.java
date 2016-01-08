import java.util.HashMap;
import java.util.Scanner;

public class ElecUse
{
	public static void main(String[] args)
	{
		 // Create a hash map
	      HashMap states = new HashMap();
	      
	      // Put elements to the map
	      states.put("MA", new Double(18.37));
	      states.put("CT", new Double(20.05));
	      states.put("ME", new Double(14.87));
	      states.put("NH", new Double(17.73));
	      states.put("RI", new Double(19.68));
	      states.put("VT", new Double(17.33));
	      states.put("NJ", new Double(15.55));
	      states.put("NY", new Double(18.38));
	      states.put("PA", new Double(14.49));
	      states.put("IL", new Double(13.47));
	      states.put("IN", new Double(11.77));
	      states.put("MI", new Double(14.59));
	      
	      states.put("OH", new Double(12.89));
	      states.put("WI", new Double(14.87));
	      states.put("IA", new Double(11.70));
	      states.put("KS", new Double(12.34));
	      states.put("MN", new Double(12.76));
	      states.put("MS", new Double(11.07));
	      states.put("NE", new Double(10.95));
	      states.put("ND", new Double(10.59));
	      
	      states.put("SD", new Double(11.70));
	      states.put("DE", new Double(14.40));
	      states.put("DC", new Double(13.90));
	      states.put("FL", new Double(11.61));
	      states.put("GA", new Double(11.09));
	      states.put("MD", new Double(15.35));
	      states.put("NC", new Double(12.11));
	      states.put("SC", new Double(12.65));
	      
	      states.put("VA", new Double(11.52));
	      states.put("WV", new Double(10.98));
	      states.put("AL", new Double(12.00));
	      states.put("KY", new Double(10.74));
	      states.put("MS", new Double(11.16));
	      states.put("TN", new Double(10.63));
	      states.put("AR", new Double(10.00));
	      states.put("LA", new Double(9.55));
	      states.put("OK", new Double(11.12));
	      states.put("TX", new Double(11.41));
	      states.put("AZ", new Double(12.22));
	      states.put("CO", new Double(11.74));
	      states.put("ID", new Double(10.32));
	      states.put("MT", new Double(11.29));
	      
	      states.put("NV", new Double(12.99));
	      states.put("NM", new Double(12.71));
	      states.put("UT", new Double(10.58));
	      states.put("WY", new Double(11.56));
	      states.put("CA", new Double(14.98));
	      states.put("OR", new Double(10.93));
	      states.put("WA", new Double(9.41));
	      states.put("AK", new Double(20.62));
	      states.put("HI", new Double(28.22));
	      
	      //user input
	      Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the abbreviation of your state:");
		  String state = scan.nextLine();
		  
		  double elecRate = ((Double)states.get(state)).doubleValue();
		  System.out.println(elecRate);
		  //END OF STATES' HASHMAP
		
		//computer cost based on user input from question 1
		//Scanner scan = new Scanner(System.in);
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
	}
}
		 
		//calculating battery cost (cBattery currently non-existent)
		/*double bCost = mBattery + cBattery;
		
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

}*/
