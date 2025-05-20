class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Step 1: Handle edge cases \U0001f6e1️
        if (head == null || head.next == null || k == 0) {
            return head; // Nothing to rotate, return as is
        }

        // Step 2: Find the length of the list and the tail node \U0001f4cf
        ListNode tail = head;
        int length = 1; // Start at 1 because we already have the head
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 3: Form a circular linked list \U0001f504
        tail.next = head; // Point the tail to the head, making it circular!

        // Step 4: Optimize k, handle large rotations \U0001f9ee
        k = k % length; // k could be larger than the list length
        if (k == 0) {
            tail.next = null; // If k is a multiple of length, no change
            return head;
        }

        // Step 5: Find the new tail \U0001f3af
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next; // Move to the correct spot
        }

        // Step 6: Break the circular list and form the new one ✂️
        ListNode newHead = newTail.next; // The node after newTail becomes the new head
        newTail.next = null; // Break the link to form the new tail
        return newHead;
    }
}