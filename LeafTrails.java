import java.util.ArrayList;
import java.util.*;

public class LeafTrails {
	private TreeMap<Integer,String> tmap = new TreeMap<>();
	public String[] trails(TreeNode tree) {
        // replace with working code
		ArrayList<String> res = new ArrayList<>();
		if(tree != null) {
			getpath(tree, "");
		}
		for(int path : tmap.keySet()) {
			String binary = tmap.get(path);
			res.add(binary);
		}

	return res.toArray(new String[0]);
	}
		
		
	public void getpath(TreeNode t, String path){
		if(t == null)return;
		if(t.left == null && t.right == null) {
			tmap.put(t.info, path);
		}
		if(t.left != null){
			path =  path + '0';
			getpath(t.left,path);
		}
		if(t.right != null && t.left != null) {
			path = path.substring(0, path.length() - 1);
			path = path + '1';
			getpath(t.right,path);
		}
		else if(t.right != null) {
			path = path + '1';
			getpath(t.right,path);
		}
	}
}
