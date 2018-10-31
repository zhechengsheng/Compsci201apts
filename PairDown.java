public class PairDown {
     public int[] fold(int[] list) {
         // change this code
    	 int k = list.length;
    	 if((k % 2) != 0) {
    	 int[] newlist = new int[k+1] ;
    	 for(int i = 0;i < k; i++ ) {
    		 	newlist[i] = list[i];
    	 }
    	 int m  = newlist.length/2;
    	 int[] res = new int[m];
    	 for(int i=0;i < newlist.length -1;i+=2) {
    		 int j = i/2;
    		 res[j] = newlist[i] + newlist[i+1];
    		}
    	 return res;
    	 }
    	 else {
        	 int[] res = new int[k/2];
    		 for(int i=0;i < k-1;i+=2) {
        		 int j = i/2;
        		 res[j] = list[i] + list[i+1];
        		}
    		 return res;
    		 
    	 }
     }
 }