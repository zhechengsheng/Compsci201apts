public class CounterAttack {
     public int[] analyze(String str, String[] words) {
         // change this code
    	 String [] strarr = str.split(" ");
    	 int [] res = new int[words.length];
    	 
    	 for(int i = 0; i<words.length;i++) {
    		 String a = words[i];
    		 int count = 0;
    		 for(String b:strarr) {
    			 if(a.equals(b)) {
    				 count+=1;
    			 }
    		 }
    		 res[i] = count;
    	 }
         return res;
     }
 }