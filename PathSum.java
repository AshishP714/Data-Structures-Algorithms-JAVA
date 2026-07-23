public class PathSum {

    static boolean hasPathSum(TreeNode root, int target) {

        if (root == null)
            return false;

        if (root.left == null && root.right == null)
            return target == root.val;

        return hasPathSum(root.left, target - root.val)
                || hasPathSum(root.right, target - root.val);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);

        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        System.out.println(hasPathSum(root, 22));
    }
}
