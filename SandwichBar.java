public class SandwichBar
   {
      public int whichOrder(String[] available, String[] orders){
    	int index = -1;
    	for(int i = 0; i< orders.length;i+=1) {
    		int count = 0;
    		String[] ss = orders[i].split(" ");
    		for(String s:ss) {
    			for(String m:available) {
    				if(m.equals(s)) {
    					count +=1;
    					break;
    				}
    			}
    		}
    		if(count == ss.length) {
    			index = i;
    			break;
    		}
    	}
    	return index;
      }
   }