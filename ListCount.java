/**
*Iterative solution
**/
public class ListCount {
      public int count(ListNode list) {
          // replace statement below with code you write
    	  int t = 0;
    	  while(list != null) {
    		  t+=1;
    		  list = list.next;
    	  }
	  return t;
      }
/**
 * Recursive solution 
 */
      public int count1(ListNode list) {
    	  if(list == null)return 0;
    	  else {
    		  return 1+count1(list.next);
    	  }
      }


}



