/**
 * Iterative solution
 * @author shengzhecheng
 *
 */
public class DoubleList {
      public ListNode bigify(ListNode list) {
          // replace statement below with code you write
    	  ListNode first = list;
    	  while (list != null) {
    		  list.next = new ListNode(list.info, list.next);
    		  list = list.next.next;
    	  }
          return first;
      }
      /**
       * Recursive solution
       */
      public ListNode bigify1(ListNode list) {
    	   	if (list == null) return null;
    	   	list.next = new ListNode(list.info, bigify1(list.next));
    	   	return list;
    	   }
      
  }

