import java.util.Collections;
import java.util.*;

public class AllPaths {
	private ArrayList<String> myList = new ArrayList<String>();
	public String[] paths(TreeNode root) {
        // replace with working code
		if(root != null) {
    		doPath(root,"");
    	}
    	Collections.sort(myList);
        return myList.toArray(new String[0]);
    }
	public void doPath(TreeNode t, String path) {
		if(t == null) return;
		if(t.left == null && t.right == null) {
			path = path + String.valueOf(t.info);
			myList.add(path);

		}
		else {
			path = path + String.valueOf(t.info) + "->";
				doPath(t.left,path);
				doPath(t.right,path);
			
		}
	}
}
