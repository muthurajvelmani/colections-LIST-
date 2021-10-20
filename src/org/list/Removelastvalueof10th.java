package org.list;

import java.util.ArrayList;
import java.util.List;

public class Removelastvalueof10th {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
			System.out.println("input : list = "+li);
		System.out.println("remove last value of 10th in list = "+li.remove(5));
		System.out.println(li);
	}
	}

