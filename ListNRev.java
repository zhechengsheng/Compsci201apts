public class ListNRev {
	public ListNode make(int n) {
	   	ListNode list = nlist(n);
	   	if (n == 1) return list;
	   	
	   	ListNode last = list;
	   	while (last.next != null) {
	      	last = last.next;
	   	}
	   	last.next = make(n-1);
	   	return list;
	   }

	private ListNode nlist(int n) {
	   	ListNode first = new ListNode(n);
	   	ListNode last = first;
	   	for(int k=0; k < n-1; k++) {
	      	last.next = new ListNode(n);
	      	last = last.next;
	   	}
	   	return first;
	   }
  }