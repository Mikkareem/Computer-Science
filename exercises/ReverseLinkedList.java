public class Test2 {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(2);
        head.next = new Node<>(3);
        head.next.next = new Node<>(4);
        head.next.next.next = new Node<>(5);
        head.next.next.next.next = new Node<>(6);
        head.next.next.next.next.next = new Node<>(7);

        printList(head);
        head = reverseList(head);
        System.out.println();
        printList(head);
    }

    private static Node<Integer> reverseList(Node<Integer> head) {
        Node<Integer> prev = null, next, current = head;

        while(current.next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;

        return current;
    }

    private static void printList(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
