import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/reverse-linked-list/
class ReverseLinkedList_Test {

    @Test
    public void test1() {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))));

        ListNode result = new ReverseLinkedList().reverseList(head);

        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
    }

    @Test
    public void test2() {
        assertNull(new ReverseLinkedList().reverseList(null));

    }



}