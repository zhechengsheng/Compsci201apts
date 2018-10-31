import java.util.*;
public class TreeTighten {
	 public TreeNode tighten(TreeNode t) {
		 if(t == null) return t;
		 if(Drop(t) && t.left != null) {
			 t = tighten(t.left);	
		 }
		 if(Drop(t) && t.right != null) {
			 t = tighten(t.right);
		 }
		 t.left = tighten(t.left);
		 t.right = tighten(t.right);
		 
         return t;
     }
	 public boolean Drop(TreeNode tree) {
		 if(tree == null)return false;
		 if(tree.left == null && tree.right == null) return false;
		 else if(tree.left == null || tree.right == null) {
			 return true;
		 }
		 return false; 
	 }
}
