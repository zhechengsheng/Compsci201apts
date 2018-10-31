 public class ListStretch {
      public ListNode stretch (ListNode list, int amount){
          // replace statement below with code you write
          ListNode first = list;
          while(list != null ) {
        	  for(int i = 1; i <amount;i+=1) {
        		  list.next = new ListNode(list.info, list.next);
        		  list = list.next;
        	  }
        	  list = list.next;
          }
    	  return first;
      }
  }