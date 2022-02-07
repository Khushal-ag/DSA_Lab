/*
In a sorted linked list (elements are sorted in ascending order),
eliminate duplicates from the given linked list, such that output
linked list contains only unique elements.
*/
package questions.LinkList.singly;

public class sortedDuplicate {
    private Node head1,head2;

    class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
