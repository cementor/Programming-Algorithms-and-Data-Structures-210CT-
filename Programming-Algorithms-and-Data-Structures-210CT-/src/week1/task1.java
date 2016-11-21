package week1;

import main.Manager.Tasks;
import java.util.Random;




public class task1 implements Tasks
{
	@Override

	public void run() 
	{
			
		main.Manager.consoleSpace(1);
		
		System.out.println("How many integers do you want in the Array");
		int lengthChoice = Integer.parseInt(main.Manager.read.nextLine());//allows user to choose the length of their array
		int[] inputArray = new int[lengthChoice];
		for (int i = 1; i < lengthChoice + 1; i++)//altered the int to allow for easier input into the array
		{
			System.out.println("Please input integer " + i);
			inputArray[i-1] = Integer.parseInt(main.Manager.read.nextLine());//array input
		}
			
		randomizeArray(inputArray);		
		
		System.out.println("int array");
		for (int i=0; i<inputArray.length; i++)
		{
			System.out.print(inputArray[i]+" ");
		}
		
		main.Manager.consoleSpace(1);
		System.out.println("open rationale behind implementation  y / n");
		String choice = main.Manager.read.nextLine();
		if (choice.equals("y")) main.openText.openPsuedoCode("210CT Week 1 Coursework TASK 1 rationale behind implementation.txt");
		
		
		
		main.Manager.consoleSpace(1);
		System.out.println("Rerun Code  y / n");
		String choice2 = main.Manager.read.nextLine();
		if (choice2.equals("y")) run();
		
			
		
			
		
		
	}
	public static int[] randomizeArray(int[] array)
	{
		Random rg = new Random();  		
 
		for (int i = 0; i<array.length; i++) 
		{
		    int randomPosition = rg.nextInt(array.length);//generates a random number between 0 and the array.length
		    int temp = array[i];//copies the current value from the array at position i
		    array[i] = array[randomPosition];//the current position is changed to the random number
		    array[randomPosition] = temp;//that position takes the value from where i was
		}
 
		return array;
	}

	
}
