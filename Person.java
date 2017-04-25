//===================================================================
//  Author: Zechariah Ziebart                             csc-111   A
//  Date Due: April 20, 2017
//  Assign:                         assign-21: inheritance
//  Program:   Candle
//  Purpose:
//    inheritance
//===================================================================
import java.util.*;
public class Person
{
	//========== Variables ===========
	private String firstName;
	private String lastName;
	private String msg2;

	//========= Constructors
	public person()
	{
		this.firstName = "";
		this.lastName = "";

	}
	//========= Sets =================
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	//========= Gets =================
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}

	//=============== Methods =================
	public void getInfo(String person)
	{
		Scanner keyboard = new Scanner(System.in);


		//-------------- start
		System.out.print("\nEnter First Name: ");
		this.firstName = keyboard.next();
		System.out.print("Enter Last Name: ");
		this.lastName = keyboard.next();

		switch (person)
		{
			case "S":
			Student student = new Student();
			student.getInfo();
			break;

			case "F":
			break;

			case "E":
			break;

			default:
			System.out.println("Invalid-Selection");
		}
	}
	public String toString()
	{
		String msg = "";

		msg += lastName + ", " + firstName;

		return msg;
	}

}// end program

