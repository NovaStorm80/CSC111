//===================================================================
//  Author: Zechariah Ziebart                             csc-111   A
//  Date Due: April 20, 2017
//  Assign:                         assign-21: inheritance
//  Program:   Candle
//  Purpose:
//    inheritance
//===================================================================
import java.util.*;
public class Student extends Person
{
	//========== Variables ===========
	private String majCode;
	private double gpa;

	//----------- Constructor
	public Student()
	{
		majCode = "";
		gpa = "";
	}
	//========= Sets =================
	public void setMajCode(String majCode)
	{
		this.majCode = majCode;
	}
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}

	//========= Gets =================
	public String getMajCode()
	{
		return majCode;
	}
	public double getGpa()
	{
		return gpa;
	}

	//=============== Methods =================
	public void getInfo()
	{
		Scanner keyboard = new Scanner(System.in);

		//---------------------- Start
		System.out.print("Enter Student's Major Code: ");
		this.majCode = keyboard.next();
		System.out.print("Enter Student's GPA: ");
		this.gpa = keyboard.nextDouble();

	}

	public String toString()
	{
		String msg = super.toString();

		msg += "\n\tMajor: " + majCode
			+ "\n\tGPA: " + gpa;


		return msg;
	}

}// end program

