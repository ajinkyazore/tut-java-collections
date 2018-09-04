package com.training.tutjavacollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainActivity {
 public static void main(String[] args) {
	
	 Stack<String> myStack = new Stack<>();
	 
	 myStack.push("element 0");
	 myStack.push("element 1");
	 myStack.push("element 2");
	 myStack.push("element 3");
	 myStack.push("element 4");
	 
	 myStack.forEach(System.out::println);
	 
	 System.out.println(myStack.elementAt(0));
	 
	 
	 
	 
	 
	 
}
}
