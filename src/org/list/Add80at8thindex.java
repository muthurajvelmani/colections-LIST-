package org.list;
import java.util.ArrayList;
import java.util.List;
public class Add80at8thindex {
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
		li.add(8, 80);
		System.out.println("80  at 8th  index = "+li);
}
}