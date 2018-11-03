
public class TreeOrder {
	void inOrder(TreeNode t) {
		if(t!=null) {
			inOrder(t.left);
			System.out.println(t.info);
			inOrder(t.right);
		}
	}
	void preOrder(TreeNode t) {
		if(t!=null) {
			System.out.println(t.info);
			inOrder(t.left);
			inOrder(t.right);
		}
	}
	void preOrder(TreeNode t) {
		if(t!=null) {
			inOrder(t.left);
			inOrder(t.right);
			System.out.println(t.info);
		}
	}
}
