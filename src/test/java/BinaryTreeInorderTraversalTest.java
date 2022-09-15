import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/binary-tree-inorder-traversal
class BinaryTreeInorderTraversalTest {

    /**
     *                      8
     *                  /       \
     *                /          \
     *              /             \
     *            4               12
     *          /   \          /     \
     *        2      6       10      14
     *      /  \   /  \    /   \    /  \
     *     1    3 5    7  9    11 13   15
     *
     */
    @Test
    public void test1() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(7);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(11);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        root.right.right.right = new TreeNode(15);

        List<Integer> result = new BinaryTreeInorderTraversal().inorderTraversal(root);

        assertEquals(15, result.size());
        for (int i = 0; i < 15; i++) {
            assertEquals(i + 1, result.get(i));
        }
    }

}