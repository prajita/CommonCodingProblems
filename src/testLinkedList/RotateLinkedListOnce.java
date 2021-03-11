package testLinkedList;

import java.time.LocalDateTime;

public class RotateLinkedListOnce {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	public static void main(String args[]) {
		RotateLinkedListOnce r= new RotateLinkedListOnce();
	    ListNode s=r.new ListNode(1);
	    s.next=r.new ListNode(2);
	    /*s.next.next=r.new ListNode(3);
	    s.next.next.next=r.new ListNode(4);
	    s.next.next.next.next=r.new ListNode(5);
	    s.next.next.next.next.next=r.new ListNode(6);
	    s.next.next.next.next.next.next=r.new ListNode(7);*/
	    ListNode p=s;
	    while(p!=null) {
	    	System.out.print(p.val+"   ");
	    	p=p.next;
	    }
	    System.out.println(java.time.LocalTime.now());
	    ListNode head=rotateRight(s, 1);
	    
	    while(head!=null) {
	    	System.out.print(head.val+"   ");
	    	head=head.next;
	    }
	    System.out.println(java.time.LocalTime.now());
	}
	
	public static  ListNode rotateRight(ListNode head, int k) {
		int length=0;
        ListNode ptr=head;
        ListNode end=null;
        while(ptr!=null){
            length++;
            end=ptr;
            ptr=ptr.next;
            
        }
       
        ptr=head;
        if(length==0) return null;
        if(length==1||k==0) return head;
        int num =  k % length;
        ListNode prev=null;

        while(num>=0 && ptr.next!=null){
            prev=ptr;
            ptr=ptr.next;
            num--;
        }
        
        prev.next=null;
        end.next=head;
        return ptr;
        
    }
	//not a good approach- O(n*n)
	/*public static ListNode rotateRight(ListNode head, int k) {
        int i=0;
        ListNode temp=null;
        while(i<k){
            temp=rotateOnce(head);
            head=temp;
            i++;
        }
        return head;
        
    }
    public static ListNode rotateOnce(ListNode head){
        if(head==null){
            return null;
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        if(prev==null){
            return head;
        }
        prev.next=null;
        curr.next=head;
        head=curr;
        return head;
        
    }*/
}
