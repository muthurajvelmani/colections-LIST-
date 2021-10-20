package org.list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Removealllll {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(10);	li.add(20);	li.add(30);li.add(90);li.add(10);	li.add(10);li.add(40);li.add(50);
			System.out.println("input : list = "+li);
			List<Integer>l2=new LinkedList<>();
		l2.add(100);l2.add(200);l2.add(600);l2.add(500);l2.add(400);l2.add(700);l2.add(800);l2.add(900);
			System.out.println("input : list2 = "+l2);
		          l2.removeAll(li);
		           System.out.println("remove all comman value  = "+l2);
}
}
