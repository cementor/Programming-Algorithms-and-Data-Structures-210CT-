package week1;

import main.Manager.Tasks;
import java.util.Random;


public class task1 implements Tasks
{
	@Override

	public void run()
	{
		System.out.println("Success");
		main.Manager.consoleSpace(1);
		
		
		int[] inputArray = new int[]{5,3,8,6,1,9,2,7};
				
		
		randomizeArray(inputArray);		
		
		System.out.println("int array");
		for (int i=0; i<inputArray.length; i++)
		{
			System.out.print(inputArray[i]+" ");
		}
		
	}
	public static int[] randomizeArray(int[] array)
	{
		Random rgn = new Random();  		
 
		for (int i=0; i<array.length; i++) 
		{
		    int randomPosition = rgn.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
 
		return array;
	}
}
