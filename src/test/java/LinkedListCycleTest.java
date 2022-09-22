import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    /**
     *
     *
     *     3 -> 2 -> 0 -> -4
     *          ^          |
     *          |__________|
     *
     */
    @Test
    public void test1() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // cycle

        ListNode result = new LinkedListCycle().detectCycle(node1);

        assertEquals(2, result.val);
    }

    /**
     *
     *
     *     3 -> 2 -> 0 -> 1 -> 1 -> 1 -> 1 -> 1 -> -4
     *                                        ^     |
     *                                        |_____|
     *
     */
    @Test
    public void test2() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(1);
        ListNode node8 = new ListNode(1);
        ListNode node9 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node8; // cycle

        ListNode result = new LinkedListCycle().detectCycle(node1);

        assertEquals(1, result.val);
    }
    /**
     *
     *
     *     1 -> 2
     *     ^    |
     *     |____|
     *
     */
    @Test
    public void test3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1; // cycle

        ListNode result = new LinkedListCycle().detectCycle(node1);

        assertEquals(1, result.val);
    }


    /**
     * No cycle
     */
    @Test
    public void test4() {
        ListNode node1 = new ListNode(3);

        assertNull(new LinkedListCycle().detectCycle(node1));
    }
    /**
     *     No cycle
     *     3 -> 2 -> 0 -> -4
     */

    @Test
    public void test5() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        assertNull(new LinkedListCycle().detectCycle(node1));
    }
}