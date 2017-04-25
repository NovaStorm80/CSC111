//===================================================================
//  Author: Zechariah Ziebart                             csc-111   A
//  Date Due: April 20, 2017
//  Assign:                         assign-21: inheritance
//  Program:   CandleDriver
//  Purpose:
//    inheritance
//===================================================================
import java.util.*;
public class CollegeListDriver
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args)
	{
		int numPeople = 0;
		String answer = "";

		//----- initializing
		Person[] people = new Person[14];
		for (int i=0;i<14;i++)
		people[i] = new Person();

		//------ getting the data for the College
		System.out.println("-- Welcome to College List --");

		for (int i=0; i<14;i++)
		{

			answer = choosePerson();
			if(answer.equalsIgnoreCase("q"))
				break;
			people[i].getInfo(answer);

			numPeople++;
		}
		System.out.println("\nSummary:");
		for(int i=0; i<numPeople; i++)
		{
			System.out.println();
		}


		//------ main processes


	}// end main

	//=============== Methods =================
	public static String choosePerson()
	{
		String answer = "";

		//Start of method
		System.out.println("\nWhat type of person are you entering?");
		System.out.println("\tFor Staff Employee enter E:");
		System.out.println("\tFor Faculty Member enter F:");
		System.out.println("\tFor Student enter S:");
		System.out.println("\tTo quit enter Q:");
		System.out.print("Answer : ");
		answer = keyboard.next();

		return answer;
	}

}// end program

