public class ListLastFirst {
      public ListNode move(ListNode list) {
          // replace statement below with code you write
    	  if(list == null) return list;
    	  ListNode first = list;
    	  while(list.next != null) {
    		  list = list.next;
    	  }
    	  
    	  ListNode last = new ListNode(list.info,null);
    	  ListNode update = last;
    	  while(first.next!= null) {
    	  update.next = new ListNode(first.info,null);
    	  update = update.next;
    	  first = first.next;
    	  }
          return last ;
      }
  }