import java.util.*;

public class SimpleWordGame {
      public int points(String[] player, 
                        String[] dictionary) {
          // you write code here
    	 HashSet<String> p = new HashSet<String>(Arrays.asList(player));
    	 HashSet<String> d = new HashSet<String>(Arrays.asList(dictionary));
    	 HashSet<String> copy = new HashSet<String>(d);
    	 copy.retainAll(p);
    	 int ret = 0;
    	 for (String s : copy) {
    		 ret+=s.length()*s.length();
    	 }
    	 return ret;
      }
  }
