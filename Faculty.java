//===================================================================
//  Author: Zechariah Ziebart                             csc-111   A
//  Date Due: April 20, 2017
//  Assign:                         assign-21: inheritance
//  Program:   Candle
//  Purpose:
//    inheritance
//===================================================================
import java.util.*;
public class Faculty extends CollegeEmployee
{
	//========== Variables ===========
	private String tenure;
	private double payRate;

	//========= Sets =================
	public void setTenure(String tenure)
	{
		this.tenure = tenure;
	}
	public void setPayRate(double payRate)
	{
		this.payRate = payRate;
	}

	//========= Gets =================
	public String getTenure()
	{
		return tenure;
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

