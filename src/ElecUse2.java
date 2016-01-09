import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ElecUse2
{
	public static void main (String[] args)
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
		
		//drop down menu to select CPU brand, speed and # cores
		JFrame frame = new JFrame("CPU Brand, Speed, Cores");
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(500, 500);
	    frame.setLocation(430, 100);

	    JPanel panel = new JPanel();

	    frame.add(panel);

	    JLabel lbl = new JLabel("Select your CPU Brand, Speed, and Number of Cores: ");
	    lbl.setVisible(true);

	    panel.add(lbl);
	    
	    String[] CPU = { "Brand:Intel, Speed:Low, Cores:2","Brand:Intel, Speed:Medium, Cores:4","Brand:Intel, Speed:High, Cores:6","Brand:Intel, Speed:Top End, Cores:8","Brand:AMD, Speed:Low, Cores:2","Brand:AMD, Speed:Medium, Cores:4","Brand:AMD, Speed:High, Cores:6" };
		
	    final JComboBox CPUlist = new JComboBox(CPU);

	    CPUlist.setVisible(true);
	    panel.add(CPUlist);

	    JButton btn = new JButton("OK");
	    panel.add(btn);
	    
		//computer cost based on user input from question 1
		System.out.println("Enter the cost of your candidate computer:");
		int comCost = scan.nextInt();
		
		//desktop or laptop
		String laptop="yes";
		String desktop="no";
		System.out.println("Is your computer a laptop or desktop?");
		String dl = scan.next();
	
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
		String screenType = scan.next();
		
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
		
		String CPUspeed = scan.next();
		System.out.println("Enter your computer's number of cores:");
		int numberCores = scan.nextInt();
		System.out.println("Enter your computer's CPU brand:");
		String CPUbrand = scan.next();

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
		System.out.print(years);
		int months = years*12;
		
		//should we say "how long do you use you computer everyday on average?"
		System.out.println("On average, how many hours a day do you leave the power on? (please enter an integer) ");
		int hours = scan.nextInt();
		
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
			cBattery=Math.ceil((double)(years-5)/5*150); 
			System.out.print(cBattery);
			System.out.print("hi");
		}
		
		 
		//calculating battery cost
		double bCost = mBattery + cBattery; 
		
		//electricity cost
		double totalWatts=screenElec + diskElec + SpeedCoreBrand; //+ RAM
		double eCost= totalWatts*hours/1000*365*years*elecRate; 
		
		
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
	