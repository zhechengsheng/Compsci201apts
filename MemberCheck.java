import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MemberCheck {
      public String[] whosDishonest(String[] club1, 
                                    String[] club2, 
                                    String[] club3) {
             // TODO: fill in code here
    	  HashSet<String> list1 = new HashSet<String>(Arrays.asList(club1));
    	  HashSet<String> list2 = new HashSet<String>(Arrays.asList(club2));
    	  HashSet<String> list3 = new HashSet<String>(Arrays.asList(club3));
    	  HashSet<String> copy1 = new HashSet<String>(list1);
    	  list1.retainAll(list2);
    	  copy1.retainAll(list3);
    	  list2.retainAll(list3);
    	  list1.addAll(copy1);
    	  list1.addAll(list2);
    	  
    	  String[] namelist = list1.toArray(new String[list1.size()]);
    	  Arrays.sort(namelist);
    	  
    	  return namelist;
      }
   }