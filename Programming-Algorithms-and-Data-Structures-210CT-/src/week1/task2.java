package week1;



import main.Manager.Tasks;

public class task2 implements Tasks
{
	@Override

	public void run() 
	{
			
		main.Manager.consoleSpace(1);
		
		System.out.println("What is the integer number that you wish to find its factorial number and count the 0's at the end of it?");
		double input = Double.parseDouble(main.Manager.read.nextLine());
		double working = 0;
		
		
		for(double i = 5; i <= input; i = i*5)
		{
			if(input / i >= 0)
			{
				working = (input / i) + working;
			}
			
		}
		System.out.println("0's at the end of the number");
		
		System.out.println((int)working);
			
		
		
		System.out.println("Rerun Code  y / n");
		String choice = main.Manager.read.nextLine();
		if (choice.equals("y")) run();	
		
		
	}


	
}
