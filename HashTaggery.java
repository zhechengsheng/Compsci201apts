import java.util.*;
public class HashTaggery {
       public String maxTag(String[] tags, String[] mess) {
    		 HashSet<String> tset = new HashSet<>();
    		 for(String s : tags) {
    		    if (s.charAt(0) == '#') {
    		      tset.add(s);
    		    }
    		 	}
    		 int count = 0;
    		 for(String m : mess) {
    		    if (covered(m,tset)) {
    		      count += 1;
    		    }
    		 }
    		 if (count*1.0/mess.length >= 0.75) {
    		    	    return "tagged";
    		 	}
    		 	return "missed";
    		   }
    		 
      private boolean covered(String m, HashSet<String> set) {
    	for(String s : m.split(" ")) {
    		 if (set.contains(s)) return true;
    		 	}
    		 return false;
    		   }
    		}