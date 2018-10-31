 public class RemoveMin {
      public ListNode remove (ListNode list) {
          // replace statement below with code you write
    	  ListNode first = list;
    	  ListNode second = list;
    	  int k = list.info;
    	  while(list.next != null) {
    		  list = list.next;
    		  if(list.info < k) {
    			  k = list.info;
    		  }
    	  }
    	  
    	  if(second.info == k) {
    		  return second.next;
    	  }
    	  
    	  while(first.next != null) {
    		  if(first.next.info == k) {
    			 first.next = first.next.next;
    		  }
    		  else{
    			  first = first.next;
    			  }
    	  }
    	  return second;
      }
  }