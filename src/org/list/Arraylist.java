package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		List li=new ArrayList<>();
		li.add(52);
		li.add(56);
		li.add(85);
		li.add(98);
		li.add(87);
		li.add(95);
		li.add(88);
		li.add(79);
		li.add(86);
		System.out.println(li); 
		// size
		int size=li.size();
		System.out.println("size of the list is  "+size);
  		//get perticular value
	//Integer it = li.get(3);
		//System.out.println(it);
		//index of value
       int io =li.indexOf(88);
       System.out.println(io);
       //last index
       int io1=li.indexOf(79);
       System.out.println(io1);
       // present or not 
       boolean it=li.contains(9);
       System.out.println(it);
       //add  one value
       li.add(100);
       System.out.println(li);
       // add or insert any value in between list
       li.add(2,54);
       System.out.println(li);
       //replace
       li.set(2,53);
       System.out.println(li);
       // remove 
       li.remove(0);
       System.out.println(li);
       // create new list
       List<Integer>l2 =new LinkedList<Integer>();
       System.out.println(l2);
       System.out.println(l2.isEmpty());
       //list 2 values add from list 1
       l2.addAll(li);
       System.out.println("list 1........"+li);
       System.out.println("list 2........"+l2);
       // compare
       boolean equals= l2.equals(li);
       System.out.println(equals);
       // add some values to list 2
       l2.add(78);
       l2.add(74);
       l2.add(79);
       l2.add(76);
       l2.add(71);
       System.out.println(l2);
       // get comman value 
       li.retainAll(li);
       System.out.println(l2);
       //remove comman values or get a unique
       l2.removeAll(li);
       System.out.println(l2); 
       // get all values from list
       // normal for loop 
       System.out.println("******normal for loop********");
       for(int i=0;i<li.size();i++) {
    	   System.out.print(li.get(i));
       System.out.print("  ");
       }
       //enhanced for loop 
       System.out.println("*********enhenced for loop************");
      for( Integer x :l2) {
    	   System.out.println(x);
    	   
       }
       // for each method
       System.out.println();
       li.forEach(System.out::println);
       System.out.println("    ");
       
       
		
		
		
		
		
		
	}

}
