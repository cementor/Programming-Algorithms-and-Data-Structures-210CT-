package week2;

import main.Manager.Tasks;

public class task1 implements Tasks
{
	@Override
	public void run() 
	{
		main.Manager.consoleSpace(1);
		System.out.println("Please enter an integer that you wish to learn the highest perfect square for");
		double input = Double.parseDouble(main.Manager.read.nextLine());
		double root = Math.floor(Math.sqrt(input));
		int output = (int)(root * root);		
		System.out.println("The highest perfect square for " + (int)input + " is");
		System.out.println(output);
		
		main.Manager.consoleSpace(1);
		System.out.println("open pseudocode  y / n");
		String choice = main.Manager.read.nextLine();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 2 Coursework TASK 1 PSEUDO.txt");
		
		
		main.Manager.consoleSpace(20);
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.nextLine();
		if (choice2.equals("y")) run();
	}
}