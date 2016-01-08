
import java.util.Scanner;

public class ElecUse2
{
	public static void main (String[] args)
	{
		//computer cost based on user input from question 1
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cost of your candidate computer:");
		int comCost = scan.nextInt();
		
		//desktop or laptop
		String laptop="no";
		String desktop="no";
		System.out.println("Is your computer a laptop or desktop?");
		String dl = scan.nextLine();
	
		if (dl=="laptop")
		{
			laptop="yes";
		}
		if (dl=="desktop")
		{
			desktop="yes";
		}
		
		//type of screen 
		System.out.println("Enter the type of screen (LCD, CRT, or LED): ");
		String screenType = scan.nextLine();
		
		//size of screen electricity use
		System.out.println("Enter the size of screen in inches (please enter an integer in the range 11-35): ");
		int screenSize = scan.nextInt();
		double screenElec = 0; 
		
		if (screenSize<17 && screenType=="LCD")
		{
			screenElec=20;
		}
		if (screenSize>=17 && screenSize<=19 && screenType=="LCD")
		{
			screenElec=30;
		}
		if (screenSize>=20 && screenSize<=24 && screenType=="LCD")
		{
			screenElec=50;
		}
		if (screenSize>=25 && screenSize<=35 && screenType=="LCD")
		{
			screenElec=80;
		}
		if (screenSize<17 && screenType=="LED")
		{
			screenElec=18;
		}
		if (screenSize>=17 && screenSize<=20 && screenType=="LED")
		{
			screenElec=24;
		}
		if (screenSize>=21 && screenSize<=26 && screenType=="LED")
		{
			screenElec=30;
		}
		if (screenSize>=27 && screenSize<=37 && screenType=="LED")
		{
			screenElec=70;
		}
		if (screenSize<17 && screenType=="CRT")
		{
			screenElec=60;
		}
		if (screenSize>=17 && screenSize<=20 && screenType=="CRT")
		{
			screenElec=80;
		}
		if (screenSize>=21 && screenSize<=24 && screenType=="CRT")
		{
			screenElec=110;
		}
		if (screenSize>=25 && screenSize<=35 && screenType=="CRT")
		{
			screenElec=130;
		}
		
		
		//size of hard disk electricity use
		System.out.println("Enter the size of hard disk in inches (please enter either 2.5 or 3.5): ");
		double diskSize = scan.nextDouble();
		double diskElec = 0;
		
		if (diskSize==2.5)
		{
			diskElec=1.85;
		}
		if (diskSize==3.5)
		{
			diskElec=7.75;
		}
		
		//Ask for CPU speed, number of cores, CPU brand. Should we have them enter this all at once and store it in a list somehow??
		System.out.println("Enter your computer's CPU Speed:");
		String CPUspeed = scan.nextLine();
		System.out.println("Enter your computer's number of cores:");
		int numberCores = scan.nextInt();
		System.out.println("Enter your computer's CPU brand:");
		String CPUbrand = scan.nextLine();
		double SpeedCoreBrand = 0;
				
		if (CPUspeed=="low" && numberCores==2 && CPUbrand=="Intel") 
		{
			SpeedCoreBrand=64;
		}
		if (CPUspeed=="medium" && numberCores==4 && CPUbrand=="Intel") 
		{
			SpeedCoreBrand=84;
		}
		if (CPUspeed=="high" && numberCores==6 && CPUbrand=="Intel") 
		{
			SpeedCoreBrand=86;
		}
		if (CPUspeed=="top end" && numberCores==8 && CPUbrand=="Intel") 
		{
			SpeedCoreBrand=140;
		}
		if (CPUspeed=="low" && numberCores==2 && CPUbrand=="AMD") 
		{
			SpeedCoreBrand=80;
		}
		if (CPUspeed=="medium" && numberCores==4 && CPUbrand=="AMD") 
		{
			SpeedCoreBrand=95;
		}
		if (CPUspeed=="high" && numberCores==6 && CPUbrand=="AMD") 
		{
			SpeedCoreBrand=110;
		}
		

		//taking in how long the user will use the computer
		System.out.println("How many years do you expect to keep your computer? (please enter an integer) ");
		int years = scan.nextInt();
		int months = years*12;
		
		//should we say "how long do you use you computer everyday on average?"
		System.out.println("On average, how many hours a day do you leave the power on? (please enter an integer) ");
		int hours = scan.nextInt();
		
		//State
		System.out.println("What state will you be using your computer in primarily?");
		String state=scan.nextLine();
		double stateCost = 5; //temporary assignment for tetsing 
		
		
		//considering mouse battery
		String mouse="no";
		System.out.println("Does your mouse need a battery? (enter no if you don't have a mouse): ");
		//problem: accurately calculates mBattery but does not allow user input, 
		//thus this doesn't work for a user without a mouse
		String yn = scan.next();
		if (yn=="yes")
		{
			mouse="yes";
		}
		
		int mBattery;
		mBattery=0;
	
		if (mouse=="yes")
		{
			mBattery=2*(months-2);
			if (mBattery<=0)
			{
				mBattery=0;
			}
			System.out.println(mBattery);
		}
		if (yn=="no")
		{
			mBattery=0;
		}
		
		//computer battery (using least integer function!!!!!!!)
		double cBattery = 0;
		
		if (desktop=="yes")
		{
			cBattery=0;
		}
		if (laptop=="yes")
		{
			double tempBattery=((years-5)/5)*150;
			cBattery=Math.ceil(tempBattery);
		}
		
		 
		//calculating battery cost
		double bCost = mBattery + cBattery; 
		
		//electricity cost
		double totalWatts=screenElec + diskElec + SpeedCoreBrand; //+ RAM
		double eCost= totalWatts*hours/1000*365*years*stateCost; 
		
		
		
		
		//calculating total cost (eCost currently non-existent)
		double totalCost = comCost + eCost + bCost;
		
		//final print statements to display answers
		System.out.println("Computer cost = " + comCost);
		System.out.println("Electricity cost = " + eCost);
		System.out.println("Battery cost = " + bCost);
		System.out.println("Total cost = " + totalCost);
		
		
	}
	
}
		

		//What does this do?
		//public int CpuSpeedCore(String CPUspeed, int numberCores, String CPUbrand)
	
   