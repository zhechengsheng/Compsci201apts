import java.util.Collections;
import java.util.*;

public class SortedLeaves {
	ArrayList<Integer> myList = new ArrayList<Integer>();
	public String[] values(TreeNode tree) {
        // replace with working code
		if(tree != null) {
		findleaf(tree);
		}
		Collections.sort(myList);
		String[] res = new String[myList.size()];
		for(int i = 0;i <  myList.size();i++) {
			res[i] = Character.toString((char)(int)myList.get(i));
			
		}
        return res;
    }
	public void findleaf(TreeNode t) {
		if(t == null) return;
		if(t.left == null && t.right == null) {
			myList.add(t.info);
		}
		if(t.left != null) findleaf(t.left);
		if(t.right != null)findleaf(t.right);
	}

}
