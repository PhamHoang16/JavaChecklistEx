package LinkedList;

public class InsertMultiple {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insertAtPos(Node head, int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return head;
        }

        for (int i = 0; i < position; i++) {
            if (head == null) {
                System.out.println("Position out of range");
                return head;
            }
            head = head.next;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        printList(head);

        head = insertAtPos(head, 4, 2);

        printList(head);

    }

}
