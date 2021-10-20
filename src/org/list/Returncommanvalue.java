package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Returncommanvalue {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(10);	li.add(20);	li.add(30);li.add(90);li.add(10);	li.add(10);li.add(40);li.add(50);
			System.out.println("input : list = "+li);
			List<Integer>l2=new LinkedList<>();
			l2.add(10);l2.add(20);l2.add(60);l2.add(50);l2.add(40);l2.add(70);l2.add(80);l2.add(90);
			System.out.println("input : list2 = "+l2);
		          l2.retainAll(li);
		           System.out.println("return comman value  = "+l2);
		
}
}
