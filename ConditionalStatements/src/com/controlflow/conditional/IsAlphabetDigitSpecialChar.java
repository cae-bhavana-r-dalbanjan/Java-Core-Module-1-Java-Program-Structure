package com.controlflow.conditional;

public class IsAlphabetDigitSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='A';
		if(( ch >= 'A' && ch <= 'Z' ) || ( ch >= 'a' && ch <= 'z'))
		{
			System.out.println(ch + " is character ");
		}
		else if( ch >= '0' && ch <= '9')
		{
			System.out.println(ch + " is digit ");
		}
		else
		{
			System.out.println(ch + " is special character ");
		}

	}

} 
