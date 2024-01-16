class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Find the middle of the linked list
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the linked list into two halves
        prev.next = null;
        ListNode l1 = head;
        ListNode l2 = reverse(slow);

        // Merge the two halves
        merge(l1, l2);
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private static void merge(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode nextL1 = l1.next;
            ListNode nextL2 = l2.next;

            l1.next = l2;
            l2.next = nextL1;

            l1 = nextL1;
            l2 = nextL2;
        }
    }
}
