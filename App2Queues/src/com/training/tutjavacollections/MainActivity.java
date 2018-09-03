package com.training.tutjavacollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MainActivity {
 public static void main(String[] args) {
	
	 Queue<String> queueA = new LinkedList();

	 queueA.add("element 0");
	 queueA.add("element 1");
	 queueA.add("element 2");
	 
	 queueA.forEach(System.out::println);
	 System.out.println("******************");
	 queueA.remove();
	 
	 queueA.forEach(System.out::println);
	 System.out.println("******************");
	 
	 Deque<String> dq= new ArrayDeque<>();
	 dq.add("element 0");
	 dq.add("element 1");
	 dq.add("element 2");
	 dq.add("element 3");
	 dq.add("element 4");
	 dq.add("element 5");
	 dq.add("element 6");
	 
	 
	 dq.forEach(System.out::println);
	 System.out.println("******************");
	 
	 dq.remove();
	 dq.forEach(System.out::println);
	 System.out.println("******************");
	 
	 dq.removeFirst();
	 dq.forEach(System.out::println);
	 System.out.println("******************");
	 
	 dq.removeLast();
	 dq.forEach(System.out::println);
	 System.out.println("******************");
	 
	 
	 
	 
}
}
