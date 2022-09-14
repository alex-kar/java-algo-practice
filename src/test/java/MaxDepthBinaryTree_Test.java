import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
class MaxDepthBinaryTree_Test {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)));

        int result = new MaxDepthBinaryTree().maxDepth(root);

        assertEquals(3, result);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2));

        int result = new MaxDepthBinaryTree().maxDepth(root);

        assertEquals(2, result);
    }
}