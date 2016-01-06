
import java.util.Scanner;

public class ElecUse
{
	public static void main(String[] args)
	{
		//computer cost based on user input from question 1
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cost of your candidate computer:");
		int comCost = scan.nextInt();
		System.out.println("Computer cost = " + comCost);

		//electricity cost based on size of screen 
		System.out.println("Enter the cost of your candidate computer:");
		int comCost = scan.nextInt();
		System.out.println("Computer cost = " + comCost);
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
