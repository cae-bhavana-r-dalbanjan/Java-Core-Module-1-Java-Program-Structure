package com.controlflow.conditional;

public class SwitchIsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'u';
		switch(ch)
		{
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' : System.out.println(ch + " is vowel ");
		         break;
		default  : System.out.println(ch + " is not a vowel ");
			
		}

	}

}
