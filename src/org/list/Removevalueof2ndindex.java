package org.list;
import java.util.ArrayList;
import java.util.List;
public class Removevalueof2ndindex {
public static void main(String[] args) {
	List<Integer>li=new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	li.add(60);
	System.out.println("input : list = "+li);
	System.out.println("remove value of 2nd index = "+li.remove(2));
}
}
