package org.list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Returncommonvalue {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(10);	li.add(20);	li.add(30);li.add(40);li.add(50);	li.add(60);li.add(70);li.add(80);
			System.out.println("input : list = "+li);
			List<Integer>l2=new LinkedList<>();
		l2.add(100);l2.add(200);l2.add(300);l2.add(500);l2.add(600);l2.add(700);l2.add(800);
			System.out.println("input : list2 = "+l2);
		          l2.retainAll(li);
		           System.out.println("return comman value  = "+l2);

}
}

