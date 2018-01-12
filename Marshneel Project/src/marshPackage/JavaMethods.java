package marshPackage;

public class JavaMethods {

	//A.User defined methods Returning Value (involked by object)....................
	
	//Creating Method
	public int multiply(int a,int b,int c){
		int result = a*b*c;
		return result;
	}
	//B. User defined methods Returning Value (without object)...
	//Creating Method
	public static int addition(int x,int y,int z){
		int add = x+y+z;
		return add;
	}
	
	// C. User defined method not returning value (Call by invoking object)
	public void studentresult(int marks){
		if (marks >=40)
		System.out.println("Passed ");
		else
			System.out.println("Fail");			
	}
	
	
	// D. User defined method not returning value (Call without object)
	
	public static void studentfit(int weight){
		if(weight <=45) 
		System.out.println("Student not fit");
		else
			System.out.println("Student is fit");
	}
	public static void main(String [] args){
		
	//Create Object
		JavaMethods obj = new JavaMethods();
	//Call method A by Invoking object and return in variable	
		int z = obj.multiply(10, 20, 30);
		System.out.println("Result by storing is "+z);
 	//Call method A by Invoking object and return directly
		System.out.println("Result displaying automatically is " +obj.multiply(2, 3, 6));
		
		
    //Call method B w/o invoking object
		int s = addition(2,4,6);
		System.out.println("Addition is "+s);
	
	
	//Call method C by invoking object
	
	JavaMethods obz2 = new JavaMethods();
	obz2.studentresult(43);
	
	// Call method D, w/o object
	studentfit(67);
	
	//Call external method divide from other class Sample by creating object
	
	Sample obb = new Sample();
	int u = obb.divide(60, 2);
	System.out.println(" Division is "+u);
	
	// Call external method from other call w/o object
	
	Sample.employeedesignation(5000);
	}
	
}
