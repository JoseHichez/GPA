/*********************************************************************
Author : Jose Hichez
Course : COP4814
Professor : Caryl Rahn
Program : 2
Purpose : This program is meant to perform unit testing for student GPA and Class request
Due Date : 09/20/2020
Certification:
I hereby certify that this work is my own and none of it is the work of any other person.
..........{ Jose Hichez }..........
*********************************************************************/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRegistrar 
{
//Start of tutorial test 
	@Test
	public void testCanRegister_1() 
        {
		
		Registrar R = new Registrar();
		boolean actual = R.canRegister(16, 2.99);
		boolean expected = false;
		
		assertEquals(expected,actual);
	}
    
	
	@Test
    public void testCanRegister_2() 
        {
		
		Registrar R = new Registrar();
		boolean actual = R.canRegister(16, 3.0);
		boolean expected = true;
		
		assertEquals(expected,actual);
	}
	
	
	@Test
    public void testCanRegister_3() 
        {
		
		Registrar R = new Registrar();
		R.setOverride(false);
		boolean actual = R.canRegister(1, 1.99);
		boolean expected = false;
		
		assertEquals(expected,actual);
	}
	
	
	@Test
    public void testCanRegister_4() 
        {
		
		Registrar R = new Registrar();
		R.setOverride(true);
		boolean actual = R.canRegister(1, 1.99);
		boolean expected = true;
		
		assertEquals(expected,actual);
	}
	
	
//Start of additional unit test
	@Test
	public void testCanRegister_5() 
        {
		
		Registrar R = new Registrar();
		boolean actual = R.canRegister(18, 3.5);
		boolean expected = true;
		
		assertEquals(expected,actual);
	}
	
    
	@Test
    public void testCanRegister_6() 
        {
		
		Registrar R = new Registrar();
		boolean actual = R.canRegister(12, 2.5);
		boolean expected = true;
		
		assertEquals(expected,actual);
	}
	
	
	@Test
    public void testCanRegister_7() 
        {
		
		Registrar R = new Registrar();
		R.setOverride(true);
		boolean actual = R.canRegister(3, 1.99);
		boolean expected = true;
		
		assertEquals(expected,actual);
	}
	
	
	@Test
    public void testCanRegister_8() 
        {
		
		Registrar R = new Registrar();
		R.setOverride(false);
		boolean actual = R.canRegister(6, 1.50);
		boolean expected = false;
		
		assertEquals(expected,actual);
	}
}
