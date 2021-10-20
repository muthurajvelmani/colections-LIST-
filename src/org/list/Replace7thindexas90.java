package org.list;
import java.util.ArrayList;
import java.util.List;
public class Replace7thindexas90 {
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
		li.set(7, 90);
		System.out.println("Replace value present in 7th index as 90 = "+li);
}
	
}
