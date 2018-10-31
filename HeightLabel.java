
public class HeightLabel {
	public TreeNode rewire(TreeNode t) {
        // replace with working code
		if(t == null) return null;
		
		TreeNode left = rewire(t.left);
		TreeNode right = rewire(t.right);
        int size = height(t);
		return new TreeNode(size, left, right);
		}
	
	
	
	
	public int height(TreeNode root) {
		if (root == null) return 0;
		else {
			return 1 + Math.max(height(root.left), height(root.right));
		}
	}
}