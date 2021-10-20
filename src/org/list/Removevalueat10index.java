package org.list;
import java.util.ArrayList;
import java.util.List;
public class Removevalueat10index {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(80);
		li.add(45);
		li.add(35);
		li.add(54);
		li.add(58);
		System.out.println("input : list = "+li);
		System.out.println("remove value of 10th index = "+li.remove(10));
		System.out.println(li);
	}
	}

