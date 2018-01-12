package marshPackage;

import java.util.Random;

public class Random_function {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int turns = 0;
		for(int i=0;i<100;i++)
		{
			int dice1 = ran.nextInt();
			int dice2 = ran.nextInt();
			if (dice1 == dice2){
			turns++;	
			}
		}
		System.out.println(turns);

	}

}

