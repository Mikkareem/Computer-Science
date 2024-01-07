import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(3);
        head.next.next.next.next = new Node<>(2);
        head.next.next.next.next.next = new Node<>(1);

        printList(head);
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(Node<Integer> head) {
        Stack<Integer> nums = new Stack<>();
        Node<Integer> temp = head;
        while(temp != null) {
            nums.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            if(!nums.pop().equals(temp.data)) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    private static void printList(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
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
