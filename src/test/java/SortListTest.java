import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/sort-list/
class SortListTest {

    @Test
    public void test1() {
        ListNode head =
                new ListNode(4,
                        new ListNode(2,
                                new ListNode(1,
                                                new ListNode(3))));

        ListNode result = new SortList().sortList(head);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
    }

    @Test
    public void test2() {
        ListNode head =
                new ListNode(-1,
                        new ListNode(5,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(0)))));

        ListNode result = new SortList().sortList(head);

        assertEquals(-1, result.val);
        assertEquals(0, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }

    @Test
    public void test3() {
        assertNull(new ReverseLinkedList().reverseList(null));
    }

}