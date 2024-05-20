package LinkedList;

public class ReverseIterate {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void iterateReverseRecursive(Node head) {
        if (head == null) {
            return;
        }
        iterateReverseRecursive(head.next);
        System.out.print(head.data + " -> ");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        iterateReverseRecursive(head);
        System.out.println("null");
    }

}
