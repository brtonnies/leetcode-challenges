/*
        CHALLENGE: Write a function to delete a node in a singly-linked list. You will not be given access to the head
                   of the list, instead you will be given access to the node to be deleted directly.

            --> It is guaranteed that the node to be deleted is not a tail node in the list.
 */

public class DeleteLinkedListNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        ListNode next = node.next;

        while (next.next != null) {
            node.val = next.val;
            node = node.next;
            next = node.next;
        }

        node.val = next.val;
        node.next = null;
    }
}
