import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // https://leetcode.com/problems/merge-k-sorted-lists/
    @Test
    public void test1() {
        ListNode[] array = new ListNode[3];

        // 1>4>5
        ListNode node3 = new ListNode(5);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(1, node2);
        array[0] = node1;

        // 1>3>4
        node3 = new ListNode(4);
        node2 = new ListNode(3, node3);
        node1 = new ListNode(1, node2);
        array[1] = node1;

        // 2>6
        node2 = new ListNode(6);
        node1 = new ListNode(2, node2);
        array[2] = node1;

        ListNode result = new Solution().mergeKLists(array);

        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(1, result.next.val);
        Assertions.assertEquals(2, result.next.next.val);
        Assertions.assertEquals(3, result.next.next.next.val);
        Assertions.assertEquals(4, result.next.next.next.next.val);
        Assertions.assertEquals(4, result.next.next.next.next.next.val);
        Assertions.assertEquals(5, result.next.next.next.next.next.next.val);
        Assertions.assertEquals(6, result.next.next.next.next.next.next.next.val);
    }

    @Test
    public void test2() {
        ListNode[] array = new ListNode[0];

        ListNode result = new Solution().mergeKLists(array);

        Assertions.assertNull(result);
    }

    @Test
    public void test3() {
        ListNode[] array = new ListNode[1];
        array[0] = null;

        ListNode result = new Solution().mergeKLists(array);

        Assertions.assertNull(result);
    }
}