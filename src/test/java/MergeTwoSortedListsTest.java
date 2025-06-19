import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/description/
class MergeTwoSortedListsTest {

    @Test
    void test1() {
        // 1 -> 2 -> 4
        ListNode a3 = new ListNode(4);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);

        // 1 -> 3 -> 4 -> 5
        ListNode b4 = new ListNode(5);
        ListNode b3 = new ListNode(4, b4);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(1, b2);

        ListNode actual = new MergeTwoSortedLists().mergeTwoLists(a1, b1);

        Assertions.assertEquals(1, actual.val);
        Assertions.assertEquals(1, actual.next.val);
        Assertions.assertEquals(2, actual.next.next.val);
        Assertions.assertEquals(3, actual.next.next.next.val);
        Assertions.assertEquals(4, actual.next.next.next.next.val);
        Assertions.assertEquals(4, actual.next.next.next.next.next.val);
        Assertions.assertEquals(5, actual.next.next.next.next.next.next.val);
        Assertions.assertNull(actual.next.next.next.next.next.next.next);
    }

    @Test
    void test2() {
        ListNode actual = new MergeTwoSortedLists().mergeTwoLists(null, null);

        Assertions.assertNull(actual);
    }

    @Test
    void test3() {
        ListNode actual = new MergeTwoSortedLists().mergeTwoLists(null, new ListNode(0));

        Assertions.assertEquals(0, actual.val);
        Assertions.assertNull(actual.next);
    }
}