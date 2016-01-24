import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
/*Markus Feng: credit for idea of using arrays to store questions & answers, 
 * teaching me how to use textField, label and button
*/

public class ElecUse2 extends Applet
{
	private static final long serialVersionUID = -6542216401840581991L;

	// creates questions array w/ all questions
	private String[] questions = {
			"What's your name?",
			"Enter the abbreviation of your state:",
			"Enter the cost of your candidate computer (Enter an integer):",
			"Is your computer a laptop or desktop?",
			"Enter the type of screen (LCD, CRT, or LED): ",
			"Enter the size of screen in inches (please enter an integer in the range 11-35): ",
			"Enter the size of hard disk in inches (please enter either 2.5 or 3.5): ",
			"Select your computer CPU brand, speed, and number of cores (enter a letter a-g:)\n"
					+ "a: Intel low speed 2 cores\n"
					+ "b: Intel medium speed 4 cores\n"
					+ "c: Intel high speed 6 cores\n"
					+ "d: Intel top speed 8 cores\n"
					+ "e: AMD low speed 2 cores\n"
					+ "f: AMD medium speed 4 cores\n"
					+ "g: AMD high speed 4 cores",
			"How many years do you expect to keep your computer? (please enter an integer)",
			"On average, how many hours a day do you leave the power on? (please enter an integer) ",
			"Does your mouse need a battery? (enter no if you don't have a mouse) " };

	// create answer array w/ same length as questions array
	private String[] answers = new String[questions.length];

	//to keep track of question #
	private int index = 0;

	//declares textField (answer) and label (question), button never referenced
	private JTextField textField;
	private JTextPane label;

	public ElecUse2()
	{
		setForeground(new Color(0, 0, 0));
		setFont(null);
		setLayout(null);
		//create text field
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(6, 241, 141, 30);
		textField.setForeground(new Color(25, 25, 112));
		//what is next 2 lines??
		add(textField);
		textField.setColumns(10);
		
		//create submit button
		final JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(191, 242, 117, 29);
		btnSubmit.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		
		//things triggered by pressing of submit button
		btnSubmit.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0)
			{
				answers[index] = textField.getText();
				textField.setText("");
				index++;
				//when end of questions, run calculate
				if (index == questions.length)
				{
					label.setText(calculate());
					btnSubmit.setEnabled(false);
				}
				//keep going through questions
				else
				{
					label.setText(questions[index]);
				}
			}
		});
		add(btnSubmit);
		
		//create question label
		label = new JTextPane();
		label.setBounds(6, 22, 357, 207);
		label.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		label.setBackground(new Color(240, 248, 255));
		label.setForeground(new Color(0, 0, 0));
		label.setEditable(false);
		add(label);
		
		//displays 1st question
		label.setText("What's your name?");
	}

	//method to do all calculations, answer array replaces scan - answer array stored into same variables
	//returns final output displayed to user
	private String calculate()
	{
		String name = answers[0];

		HashMap<String, Double> states = new HashMap<String, Double>();

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

		double elecRate = states.get(answers[1]).doubleValue();

		int comCost = Integer.parseInt(answers[2]);

		// desktop or laptop
		String laptop = "no";
		String desktop = "no";
		String dl = answers[3];
		if (dl.equals("laptop"))
		{
			laptop = "yes";
		}
		if (dl.equals("desktop"))
		{
			desktop = "yes";
		}

		// type of screen
		String screenType = answers[4];

		// electricity use based on the size of screen
		int screenSize = Integer.parseInt(answers[5]);
		double screenElec = 0;

		if (screenSize < 17 && screenType.equals("LCD"))
		{
			screenElec = 20;
		}
		if (screenSize >= 17 && screenSize <= 19 && screenType.equals("LCD"))
		{
			screenElec = 30;
		}
		if (screenSize >= 20 && screenSize <= 24 && screenType.equals("LCD"))
		{
			screenElec = 50;
		}
		if (screenSize >= 25 && screenSize <= 35 && screenType.equals("LCD"))
		{
			screenElec = 80;
		}
		if (screenSize < 17 && screenType.equals("LED"))
		{
			screenElec = 18;
		}
		if (screenSize >= 17 && screenSize <= 20 && screenType.equals("LED"))
		{
			screenElec = 24;
		}
		if (screenSize >= 21 && screenSize <= 26 && screenType.equals("LED"))
		{
			screenElec = 30;
		}
		if (screenSize >= 27 && screenSize <= 37 && screenType.equals("LED"))
		{
			screenElec = 70;
		}
		if (screenSize < 17 && screenType.equals("CRT"))
		{
			screenElec = 60;
		}
		if (screenSize >= 17 && screenSize <= 20 && screenType.equals("CRT"))
		{
			screenElec = 80;
		}
		if (screenSize >= 21 && screenSize <= 24 && screenType.equals("CRT"))
		{
			screenElec = 110;
		}
		if (screenSize >= 25 && screenSize <= 35 && screenType.equals("CRT"))
		{
			screenElec = 130;
		}

		// size of hard disk electricity use
		double diskSize = Double.parseDouble(answers[6]);
		double diskElec = 0;

		if (diskSize == 2.5)
		{
			diskElec = 1.85;
		}
		if (diskSize == 3.5)
		{
			diskElec = 7.75;
		}

		// Ask for CPU speed, number of cores, CPU brand and store corresponding
		// electricity use in variable SpeedCoreBrand
		String CPUspeed = answers[7];

		double SpeedCoreBrand = 0;

		if (CPUspeed.equals("a"))
		{
			SpeedCoreBrand = 64;
		}
		if (CPUspeed.equals("b"))
		{
			SpeedCoreBrand = 84;
		}
		if (CPUspeed.equals("c"))
		{
			SpeedCoreBrand = 86;
		}
		if (CPUspeed.equals("d"))
		{
			SpeedCoreBrand = 140;
		}
		if (CPUspeed.equals("e"))
		{
			SpeedCoreBrand = 80;
		}
		if (CPUspeed.equals("f"))
		{
			SpeedCoreBrand = 95;
		}
		if (CPUspeed.equals("g"))
		{
			SpeedCoreBrand = 110;
		}

		// taking in how long the user will use the computer
		int years = Integer.parseInt(answers[8]);
		int months = years * 12;

		// how many hours the user uses the computer/day
		int hours = Integer.parseInt(answers[9]);

		// considering mouse battery
		String mouse = "no";
		String yn = answers[10];
		if (yn.equals("yes"))
		{
			mouse = "yes";
		}

		int mBattery;
		mBattery = 0;

		if (mouse.equals("yes"))
		{
			mBattery = 2 * (months - 2);
			if (mBattery <= 0)
			{
				mBattery = 0;
			}
		}
		if (yn.equals("no"))
		{
			mBattery = 0;
		}

		// cost of replacing computer battery (using least integer
		// function!!!!!!!)
		double cBattery = 0;

		if (desktop.equals("yes"))
		{
			cBattery = 0;
		}
		if (laptop.equals("yes"))
		{
			cBattery = Math.ceil((double) (years - 5) / 5) * 150;
			if (cBattery < 0)
			{
				cBattery = 0;
			}
		}
		// calculating battery cost
		double bCost = mBattery + cBattery;

		// electricity cost
		double totalWatts = screenElec + diskElec + SpeedCoreBrand + 2.5; // +
																			// 2.5
																			// is
																			// RAM
		double eCost = Math.round(totalWatts * hours / 1000 * 365 * years
				* elecRate);

		// calculating total cost
		double totalCost = Math.round(comCost + eCost + bCost);

		// final print statements to display answers
		String output = name + ", here are the approximate costs of your computer:\n" +
		" " + "\n"+"Computer cost = $" + comCost + "\n" + 
		"Electricity cost = $" + eCost + "\n" +
		"Battery cost = $" + bCost + "\n" +
		"Total cost = $" + totalCost;
		
		return output;
	}

}
