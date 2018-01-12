package marshPackage;

import java.util.Arrays;

public class Sample {
	
	public int divide(int a, int b){
		int div = a/b;
		return div;
	                               }
	
	public static void employeedesignation(int salary){
		if(salary<10000)
			System.out.println("Employee is staff");
		else
			System.out.println("Employee is management");
	                                                  }
	public static void main(String[] args) {
		int a[] = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		
		
		
			
		int i =0;
		while(i <a.length){
			System.out.println(a[i]);
			i++;
			
		}
		
		int []b = new int[4];
		int []c = {0,1,2};
		int d[] = {5,6,7};
		
		
		
		Integer x = -8;
		
		String str1[]={"Selenium", "1"};
		System.out.println(Arrays.toString(str1));
		
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isLetter('a'));
		System.out.println(x.compareTo(78));
		
		int z[][]= {{1,2,3},{6,7,9}};
		
		/*for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(z[i][j]);
					}
		}*/
		
	}
}
		
		
		
	


