package org.list;

import java.util.ArrayList;
import java.util.List;

public class Getfirstindexvalue {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		System.out.println("input : list = "+li);
		System.out.println("get first index value  = "+li.indexOf(10));
	
	}

}
