
public class TreeCount {
	 public int count(TreeNode tree) {
         if(tree == null) return 0;
		 // replace with working code
         return 1 + count(tree.left)+ count(tree.right);
     }

}
