package com.java.tokens;

public class JavaApp {
	
	
	
	public static void studentDetails() {
		String name="Bhavana";
		int age=21;
		char sec='c';
		boolean relation=false;
		float height=5.5f;
		long phno=9876543210l;
		double sal=50000;
		int id=5;
		
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
	    System.out.println("Height:"+height);
	    System.out.println("mobile-number:"+phno);
	    
	    System.out.println("section:"+sec);
	    System.out.println("Relation:"+relation);
	    System.out.println("-----------------------");
	    
	    name="Maahi";//re-initialization
	    System.out.println("Name:"+name);
	    
	    age+=1;//modification
	    System.out.println("age:"+age);
	    
	    System.out.println("sal:"+sal);
	    int salary=(int)sal;
	    System.out.println("salary:"+salary);
	    
	    System.out.println("incremented salary:"+ ++salary);
	    System.out.println("decremented age:"+ --age);
	    height+=1;
	    System.out.println("height changed:"+ height);
	    
	    System.out.println("BODMAS RULE OUTPUT:"+ (age+salary+name+height+relation));
	    System.out.println(!false);
	    System.out.println(~age);
	    System.out.println(id<<4);
	    System.out.println(id&age);
	    System.out.println(id^age);
	    
	    int a=30;
	    int b=50;
	    System.out.println(a>b? "a is greater":"b is greater");
	    int c=58;
	    System.out.println(a>b?(a>c? "a is greater":"c is greater"):
	                      (b>c? "b is greater":"c is greater"));
	    
	    
	    
	    
	    }


}
