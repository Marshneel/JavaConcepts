package marshPackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IOOperations {
	
	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		
		String s1 = "10";
		String s2 = "20";
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		//.............IO Operations........................
		/*System.out.println("Enter Number");
		int a = scan.nextInt();
		System.out.println("Your Number is "+a);
		
		System.out.println("Enter Mobile Number");
		long b = scan.nextLong();
		System.out.println("Your Mobile Number is "+b);
		
		System.out.println("Enter Full Name");
		String c = scan.nextLine();
		System.out.println("Your Full Name is "+c);  
		
		System.out.println("Enter character");
		char d = scan.next().charAt(1);
		System.out.println("Your Char is "+d); */
		//..............File Handling........................
		
		/*File file1 = new File("C:/Users/MarshneelJ/Desktop/Selenium");
		file1.delete();
		
		boolean a = file1.exists();
		if(a == true){
			System.out.println("Folder already present");
		}else
		{
			file1.mkdir();	
		}
		
		File file2 = new File("C:/Users/MarshneelJ/Desktop/Selenium/Selenium.txt");
		file2.createNewFile(); */
		
		//.................Exception Handling
		
		int a= 10;
		int b= 0;
		
	     try {
	    	 int c = a/b;
	    	 System.out.println("Result is "+c);
	     }
	     catch (ArithmeticException e){
	    	 System.out.println("Divide by zero error");
	     }
				
		
		
		
	}

}
