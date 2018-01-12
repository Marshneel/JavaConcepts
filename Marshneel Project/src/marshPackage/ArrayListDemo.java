package marshPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{

	public static void main(String[] args) {
/*........................Non-Generic Array List...............................................*/		
		ArrayList obj = new ArrayList();
		obj.add("Marshneel");
		obj.add(123);
		obj.add('w');
		obj.add(23.65);
		
		//Method 1 to display elements
		
		System.out.println("By Simple For Loop");
		int objsize = obj.size();
		for (int i=0;i<objsize;i++)
		{
			System.out.println(obj.get(i));
		}
		
		//By enhanced For Loop
		System.out.println("By Enhanced For Loop");
		for(Object obj1:obj){
			System.out.println(obj1);
			
		}
		
		//Using Iterator
		System.out.println("By using Iterator");
		 Iterator itr = obj.iterator();
		 while(itr.hasNext()){
			 Object abc = itr.next();
			 System.out.println(abc);
		 }
		
		/*.............................Generic Array List.................................................*/
		 ArrayList<String> obj1 = new ArrayList();
		 obj1.add("Marshneel");
		 obj1.add("Jarande");
		 
		 for (String s:obj1){
			 System.out.println(s);
		 }
		
		/* *****************************List*************************************** */
		 List <String> mylist = new ArrayList<>();
		 
		 mylist.add("Marshneel");
		 mylist.add("Monica");
		 mylist.add("May");
		 mylist.add("Mini");
		 
		 System.out.println(mylist);
		 
		 mylist.remove(0);
		 System.out.println(mylist);
		 
		 System.out.println("Element at start of list" + mylist.get(0));
		 System.out.println("Position of Mini is: "+mylist.indexOf("Mini"));
		 

	}

}
