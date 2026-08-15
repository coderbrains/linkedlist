package linkedList.singlyLinkedList;

public class HandlerMethod {
	
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(20);
		list.add(25);
		list.add(26);
		list.add(27);
		
		list.print();
		
		list.removeIndex(2);
		
		list.print();
		
		MyLinkedList<String> list1 = new MyLinkedList<String>();
		list1.add("hello");
		list1.add("varsha");
		list1.add("I love");
		list1.add("you");
		
		list1.print();
		
	}

}
