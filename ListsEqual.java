 public class ListsEqual {
      public int equal (ListNode a1, ListNode a2) {
          // replace statement below with code you write
      int i = 0;
      int j = 0;
      while(a1 != null) {
           i+=1;
           a1 = a1.next;
      }
      while(a2 != null) {
          j+=1;
          a2 = a2.next;
     }
      
      if(i!=j) {
    	  return 0;
      }
      while(a1 != null) {
    	  if(a1.info != a2.info ) {
    		  return 0;
    	  }
    	  a1 = a1.next;
    	  a2 = a2.next;
      }
	  return 1;
      }
  }