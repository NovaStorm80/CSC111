//===================================================================
//  Author: Zechariah Ziebart                             csc-111   A
//  Date Due: April 20, 2017
//  Assign:                         assign-21: inheritance
//  Program:   Candle
//  Purpose:
//    inheritance
//===================================================================
import java.util.*;
public class CollegeEmployee extends Person
{
	//========== Variables ===========
	private String deptName;
	private double salary;

	//========= Sets =================
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	//========= Gets =================
	public String getDeptName()
	{
		return deptName;
	}
	public double getSalary()
	{
		return salary;
	}

	//=============== Methods =================
	public String toString()
	{
		String msg = super.toString();

		msg += "\n\t";

		return msg;
	}

}// end program

