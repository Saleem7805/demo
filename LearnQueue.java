package com.DSA;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementation of Queue using Linked List.
		Queue<Integer>queue=new LinkedList<>();
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		System.out.println(queue);
		System.out.println(queue.poll());// jo element nikalta hai 
		System.out.println(queue);

	}

}
