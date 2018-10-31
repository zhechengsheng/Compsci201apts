 public class Common {
     public int count (String a, String b) {
    	 String[] aa = a.split("");
    	 String[] bb = b.split("");
    	 String mem = "";
    	 int total_count = 0;
    	 for(String s:aa) {
    		 int count1 = 0;
    		 int count2 = 0;
    		 if(!mem.contains(s)) {
    		 for(String m:bb) {
    			 if(s.equals(m)) {
    				 count1++;
    				 mem+=s;
    			 }
    		 }
    		 for(String j:aa) {
    			 if(j.equals(s)) {
    				 count2++;
    			 }
    		 }
    		 if(count1>count2) {
    			 count1 = count2;
    		 }
    		 total_count += count1;
    		 }
    	 }
    
        return total_count;
     }
  }