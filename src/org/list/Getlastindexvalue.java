package org.list;

import java.util.ArrayList;
import java.util.List;

public class Getlastindexvalue {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
	System.out.println("input : list = "+li);
	System.out.println("get last index value of 10 = "+li.lastIndexOf(10) );
	
	
	
	
	}

}
