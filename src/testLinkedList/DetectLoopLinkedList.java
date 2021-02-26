package testLinkedList;

public class DetectLoopLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(13);
		list.insert(14);
		list.insert(15);
		list.insert(16);
		
		System.out.println("show elements of the list");
		list.show();
		list.head.next.next.next.next=list.head.next;
		
		detectLoop(list);
	}
	 public static void detectLoop(LinkedList list)
	    {
	        Node slow_p = list.head, fast_p = list.head;
	        int flag = 0;
	        while (slow_p != null && fast_p != null
	               && fast_p.next != null) {
	            slow_p = slow_p.next;
	            fast_p = fast_p.next.next;
	            if (slow_p == fast_p) {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 1)
	            System.out.println("Loop found and val ::"+slow_p.data);
	        else
	            System.out.println("Loop not found");
	    }
}
