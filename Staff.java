//===================================================================
//  Author: Zechariah Ziebart                             csc-111   A
//  Date Due: April 20, 2017
//  Assign:                         assign-21: inheritance
//  Program:   Candle
//  Purpose:
//    inheritance
//===================================================================
import java.util.*;
public class Staff extends CollegeEmployee
{
	//========== Variables ===========
	private String superVisor;
	private double payRate;

	//========= Sets =================
	public void setSuperVisor(String superVisor)
	{
		this.superVisor = superVisor;
	}
	public void setPayRate(double payRate)
	{
		this.payRate = payRate;
	}

	//========= Gets =================
	public String getSuperVisor()
	{
		return superVisor;
	}
	public double getPayRate()
	{
		return payRate;
	}

	//=============== Methods =================
	public String toString()
	{
		String msg = super.toString();

		msg += "\n\t";

		return msg;
	}

}// end program

