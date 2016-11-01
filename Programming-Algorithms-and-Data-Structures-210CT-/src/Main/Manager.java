package main;

import java.util.Scanner;
import java.util.HashMap;

public class Manager 
{
	
	public static Scanner read;
	public static HashMap<String, Tasks> tasks = new HashMap<>();

	public static void main (String[] args)
	{
		tasks.put("week1 1",new week1.task1());
		
		read = new Scanner(System.in);

		System.out.println("Please Type in the Week's Worth of CourseWork You Wish To View");
		System.out.println("Accetable Format is \"week1\" \"week2\" etc");
		String week = read.nextLine();
		
		
		consoleSpace(2);
		
		
		System.out.println("Please Type in the Week's Task");
		System.out.println("Accetable Format is \"1\" \"2\" etc");
		String task = read.nextLine();
		
		consoleSpace(2);
		
		try 
		{
			tasks.get(week + " " + task).run();
		} 
		catch (Exception e) 
		{
			System.out.println("Error");
		}
		
		
		
		
				
	}
	
	
	public static interface Tasks
	{
		void run();
	}


	public static void consoleSpace(int num) 
	{
		for (int i=0; i<num; i++)
		{
			System.out.println();
		}
	}
}

