package org.list;
import java.util.ArrayList;
import java.util.List;
public class Replace10into100inlist {
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
		li.set(0, 100);
		li.set(4, 100);
		li.set(5, 100);
		System.out.println("Replace value 10 into 100 in list = "+li);
}


}
