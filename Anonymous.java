import java.util.*; 
public class Anonymous {
      public int howMany(String[] headlines, String[] messages) {
            // fill in code here
    	  ArrayList<String> letters = new ArrayList<String>();
    	  for(int i = 0 ; i< headlines.length;i++) {
    		  char[] words = headlines[i].trim().toLowerCase().toCharArray();
    		  for(char word : words) {
    			  String word1 = Character.toString(word);
    			  letters.add(word1);
    		  }
    	  }
    	  
    	  int totalcount = 0 ;
    	  for(int k = 0; k < messages.length;k++) {
    		  if(messages[k].trim().length() == 0) {
    			  totalcount += 1;
    			  continue;
    		  }
    		  String[] need  = messages[k].trim().toLowerCase().split("");
    		  ArrayList<String> needs = new ArrayList<String>(Arrays.asList(need));
    		  int count = 0;
    		  for(String s:needs) {
    			int m = Collections.frequency(letters, s);
    			int n = Collections.frequency(needs, s);
    			if(letters.contains(s) && m >= n) {
    				count += 1;
    			}
    		  }
    		  if(count == needs.size()) {
    			  totalcount +=1;
    		  }
    	  }
       return totalcount;
   }
}