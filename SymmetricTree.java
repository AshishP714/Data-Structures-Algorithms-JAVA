public class SymmetricTree {

    static boolean mirror(TreeNode a, TreeNode b){

        if(a == null && b == null)
            return true;

        if(a == null || b == null)
            return false;

        return a.val == b.val &&
               mirror(a.left, b.right) &&
               mirror(a.right, b.left);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(mirror(root.left, root.right));
    }
}
