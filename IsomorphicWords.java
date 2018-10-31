import java.util.*;
public class IsomorphicWords {
      public int countPairs(String[] words) {
    	  int count  = 0;
    	  for (int i = 1; i < words.length;i++) {
    		  String[] word1 = words[i-1].split("");
			  ArrayList<Integer> c1 = new ArrayList<>();
    		  for(String letter: word1) {
    			  int index = words[i-1].indexOf(letter); 
    			  while(index >= 0) {
    				  c1.add(index);
    				  index = words[i-1].indexOf(letter, index + 1);
    			  }
    		  }
    		  for(int k = i; k< words.length;k++) {
    			String[] word2 = words[k].split("");
    			ArrayList<Integer> c2 = new ArrayList<>();
    		  	for(String letter:word2) {
    		  		int index = words[k].indexOf(letter);
    		  		while(index >= 0) {
    				  c2.add(index);
    				  index = words[k].indexOf(letter, index + 1);
    			  }
    		  }
    		  if(c1.equals(c2)) {
    			  count+=1;
    		  }
    	  }
    	  }
    	  return count;
      }
   }