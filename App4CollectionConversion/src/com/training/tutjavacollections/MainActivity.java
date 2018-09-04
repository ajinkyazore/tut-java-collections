package com.training.tutjavacollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class MainActivity {
 public static void main(String[] args) {
		
	 
	 LinkedList<String> myLinkedList = new LinkedList();
		myLinkedList.addFirst("This");
		myLinkedList.addFirst("house");
		myLinkedList.addFirst("is");
		myLinkedList.addFirst("bitchin");
		myLinkedList.addFirst("bitchin");
		myLinkedList.addFirst("bitchin");
		myLinkedList.addFirst("bitchin");
		myLinkedList.addFirst("bitchin");
	 
		myLinkedList.forEach(System.out::println);
		System.out.println("*****************************");
		
		Set<String> targetSet = new HashSet<>(myLinkedList);
		targetSet.forEach(System.out::println);
		System.out.println("*****************************");
		
		
		List<String> myArrayList = new ArrayList<>(targetSet);
		myArrayList.forEach(System.out::println);
		System.out.println("*****************************");
		
		
		
	 
	 
	 
	 
	 
	 
}
}
