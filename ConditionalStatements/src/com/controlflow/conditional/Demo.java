package com.controlflow.conditional;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uName = "xyz";
		int password = 1234;
		if(uName == "xyz")
		{
			if(password == 123)
			{
				System.out.println(" Login successful");
			}
			else
			{
				System.out.println(" Incorrect password ");
			}
			
		}
		else
		{
			System.out.println(" Invalid username ");
		}

	}

}
