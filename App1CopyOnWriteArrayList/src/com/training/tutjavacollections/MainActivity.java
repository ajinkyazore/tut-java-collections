package com.training.tutjavacollections;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.event.ListSelectionEvent;

public class MainActivity {
 public static void main(String[] args) {
	
	 CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
	 
	 Iterator<Integer> iterator = arrayList.iterator();
	 
	 arrayList.add(10);
	 
	 List<Integer> result = new LinkedList<>();
	 iterator.forEachRemaining(result::add);
	 result.forEach(System.out::println);
	 
	 
	 
}
}
