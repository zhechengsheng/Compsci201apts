public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
    	  int[] count = new int[strands.length];
    	  for(int i = 0; i < strands.length; i++) {
            	String[] allnuc = strands[i].split("");
            	for(String s: allnuc) {
            		if(s.equals(nuc)) {
            			count[i]+=1;
            		}
            	}
            	}
    	 int[] zero = new int[strands.length];
    	 if(Arrays.equals(count,zero)) {
    		 return ""; 
    	 }
    	 int maxval = 0;
    	  for(int k = 0; k < count.length;k++) {
    		  if( maxval<= count[k]) {
    			  maxval = count[k];
    	  }
            }
    	 int len = 0;
    	 for(int m = 0 ; m <strands.length; m++) {
    		 if( maxval == count[m] && len< strands[m].length()) {
    			 len = strands[m].length();
    			 
    		 }
    	 }
    	 String ans = "";
    	 for(int n = 0 ; n <strands.length; n++) {
    		 if( len == strands[n].length()) {
    			ans =  strands[n];
    		 }
    	 }
    	 return ans;
  
    		  }
   }