
public class LevelCount {
	public int count(TreeNode t, int level) {
        // replace with working code
			if(t == null) return 0;
			if(level == 0) return 1;
			if(level != 0) {
				level = level -1;
				return count(t.left, level)+ count(t.right,level);
			}
			return 0;
			}
}