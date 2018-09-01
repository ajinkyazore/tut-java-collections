package com.training.tutjavacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.event.ListSelectionEvent;

public class MainActivity {
 @SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	List<String> sampleStringList =Collections.synchronizedList(new ArrayList());	
	
	sampleStringList.add("Mary");
	sampleStringList.add("Jane");
	sampleStringList.add("Doe");
	sampleStringList.remove(0);
	
	
	sampleStringList.forEach(System.out::println);
	
	List<Integer> integerList = Collections.synchronizedList(new ArrayList());	
	integerList.add(32);
	integerList.add(34);
	integerList.add(9);
	
	Integer intToAdd = new Integer(1000);
	integerList.add(intToAdd);
	
	integerList.remove(0);
	integerList.remove(new Integer(1000));
	
	
	//predict the output here -> you will realize you're f**ked
	integerList.forEach(System.out::println);
	
	
	LinkedList<String> myLinkedList = new LinkedList();
	myLinkedList.addFirst("This");
	myLinkedList.addFirst("house");
	myLinkedList.addFirst("is");
	myLinkedList.addFirst("bitchin");
	
	myLinkedList.forEach(System.out::println);
	 
}
}
