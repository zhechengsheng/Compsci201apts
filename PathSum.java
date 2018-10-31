
public class PathSum {
	public int hasPath(int target, TreeNode tree){
        // replace with working code
		if (tree == null) return 0;
		else {
			int sub = target - tree.info;
			if(sub == 0 && tree.left == null && tree.right == null) return 1;
			if (tree.left != null && hasPath(sub,tree.left) == 1) return 1 ; 
            if (tree.right != null && hasPath(sub,tree.right) == 1) return 1;  
            
        } 
		return 0;
    
	}
}