/*********************************************************************
Author : Jose Hichez
Course : COP4814
Professor : Caryl Rahn
Program : Lab 2
Purpose : This program is meant to perform unit testing for student GPA and Class request
Due Date : 09/20/2020
Certification:
I hereby certify that this work is my own and none of it is the work of any other person.
..........{ Jose Hichez }..........
*********************************************************************/
public class Registrar 
{
	
	private boolean override = false;
	
	//Represent Advisor Override
	void setOverride( boolean value)
	{
		override = value;
	}
	
	
	//Tests for different values if student can take requested classes
	boolean canRegister( int credits, double gpa)
	{
		if( override )
			return true;
		else if(gpa <2.0)
			return false;
		else if( gpa >= 3.0)
			return true;
		else
			return credits < 16;
	}
	
}
