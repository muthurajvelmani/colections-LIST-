package org.list;
import java.util.ArrayList;
import java.util.List;
public class Replacevalue300into350inlist {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println("input : list = "+li);
		li.set(2, 350);//replace
		System.out.println("Replace value 300 int 350 in list  = "+li);
}
}
