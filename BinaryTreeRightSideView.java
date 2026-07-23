import java.util.*;

public class BinaryTreeRightSideView {

    public static List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                if (i == size - 1)
                    result.add(current.val);

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        TreeNode2 root = new TreeNode2(1);

        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);

        root.left.right = new TreeNode2(5);
        root.right.right = new TreeNode2(4);

        System.out.println(rightSideView(root));
    }
}
