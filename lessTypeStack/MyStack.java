package linkedList.lessTypeStack;

public class MyStack<E> {
	int size = 0;
	Node<E> bottom, top;
	
	public void push(E data) {
		Node<E> node = new Node<E>(data);
		if(bottom == null || top == null || size == 0) {
			bottom = top = node;
			size++;
			return;
		}
		node.next = top;
		top = node;
		size++;
	}
	
	public E pop() {
		if(bottom == null || top == null || size == 0) {
			throw new IndexOutOfBoundsException("Empty stack");
		}
		if(top.next == null) {
			E data = top.data;
			top = bottom = null;
			size--;
			return data;
		}
		E data = top.data;
		top = top.next;
		size--;
		return data;
	}
	
	public E peek() {
		if(bottom == null || top == null || size == 0) {
			throw new IndexOutOfBoundsException("Empty stack");
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	

}
