import java.util.*;

public class Starter {
     public int begins(String[] words, String first) {
         // replace this code
    	 int count = 0;
    	 HashSet<String> hashwords = new HashSet<String>(Arrays.asList(words));
    	 for(String s: hashwords) {
    		 if(s.startsWith(first)) {
    			 count+=1;
    		 }
    	 }
         return count;
     }
 }