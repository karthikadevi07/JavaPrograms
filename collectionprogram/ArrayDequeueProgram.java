package collectionprogram;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueProgram {

	public static void main(String[] args) {
			Deque<String> deque = new ArrayDeque<>();
			deque.add("Potato");
			deque.offer("Tomato");
			deque.offer("Brinjal");
			deque.offerFirst("Drumstick");
			deque.offer("Pumpkin");
			deque.offer("Carrot");
			System.out.println("Deque: "+deque);
			System.out.println("Removing 1st element: "+deque.pollFirst());
			System.out.println("Deque: "+deque);
			System.out.println("Removing last element: "+deque.pollLast());
			System.out.println("Deque: "+deque);
			System.out.println("Head of Queue: "+deque.peek());


		}

	}


