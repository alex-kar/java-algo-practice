import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
class BinaryTreeLevelOrderTraversalTest {

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

        List<List<Integer>> result = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertEquals(4, result.size());
        assertEquals(List.of(8), result.get(0));
        assertEquals(List.of(4, 12), result.get(1));
        assertEquals(List.of(2, 6, 10, 14), result.get(2));
        assertEquals(List.of(1, 3, 5, 7, 9, 11, 13, 15), result.get(3));
    }

    @Test
    public void test2() {
        assertEquals(Collections.emptyList(), new BinaryTreeLevelOrderTraversal().levelOrder(null));
    }
}