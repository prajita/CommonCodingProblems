package testLinkedList;

public class Driver {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(13);
		list.insert(14);
		list.insertAtStart(11);
		list.insertAt(11, 17);
		list.inserAtIndex(4, 18);
		System.out.println("show elements of the list");
		list.show();
		System.out.println("deleting some elements from the list");
		list.deleteAt(0);
		list.deleteAt(1);
		list.show();
	}

}
