package linkedList.singlyLinkedList;

import java.util.Objects;

public class MyLinkedList<E> {
	
	Node<E> head = null;
	int size = 0;
	
	public void add(E data) {
		Node<E> node = new Node<E>(data);
		if(head == null) {
			head = node;
			size++;
			return;
		}
		
		Node<E> current = head;
		
		while(current.next != null) {   //10, 20, 30
			current = current.next;
		}
		
		current.next = node;
		size++;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		Node<E> current = head;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public void removeIndex(int index) {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		if(index < 0) {
			System.out.println("Empty list");
			return;
		}
		if(index >= size) {
			System.out.println("Empty list");
			return;
		}
		if(index == 0) {
			head = head.next;
			size--;
			return;
		}
		
		Node<E> prev = head;
		Node<E> current = head.next;
		int traversal = 1;
		while(index != traversal) {
			prev = current;
			current = current.next;
			traversal++;
		}
		prev.next = current.next;
		size--;		
		
	}
	
	public void removeLast() {
		if(Objects.isNull(head)) {
			System.out.println("Emtpy list");
			return;
		}
		if(head.next == null) {
			head = null;
			size--;
			return;
		}
		Node<E> prev = head;
		Node<E> current = head.next;
		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		size--;
	}
	
	public void removeFirst() {
		if(Objects.isNull(head)) {
			System.out.println("Empty list");
			return;
		}
		head = head.next;
		size--;
	}
	
	public void insertFirst(E data) {
		Node<E> node = new Node<E>(data);
		node.next = head;
		head = node;
		size++;
	}
	
	public void insertLast(E data) {
		Node<E> node = new Node<E>(data);
		if(head == null) {
			head = node;
			size++;
			return;
		}
		Node<E> current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
		size++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
