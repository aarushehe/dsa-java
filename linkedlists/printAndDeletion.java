package linkedlists;

public class printAndDeletion {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    static Node insertAtFront(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static Node insertAtPosition(Node head, int value, int position) {
        if (position == 1) {
            return insertAtFront(head, value);
        }

        Node newNode = new Node(value);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return head;

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node deleteAtEnd(Node head){

        if(head == null){
            return null;
        }

        if(head.next == null){
            return null;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteAtFront(Node head){
        if(head == null){
            return head;
        }
        return head.next;
    }

    static Node deleteAtPosition(Node head, int position){
        if(head == null){
            return null;
        }

        if(position == 1){
            return deleteAtFront(head);
        }

        Node temp = head;

        for(int i = 1; i < position - 1 && temp.next != null; i++){
            temp = temp.next;
        }

        if(temp.next == null){
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }

    static void printList(Node head) {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " --> ");
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtEnd(head, 10);
        printList(head);
        head = insertAtEnd(head, 20);
        printList(head);
        head = insertAtEnd(head, 30);
        printList(head);
        head = insertAtFront(head, 0);
        printList(head);
        head = insertAtPosition(head, 15, 3);
        printList(head);
        head = deleteAtPosition(head, 3);
        printList(head);
        head = deleteAtEnd(head);
        printList(head);
        head = deleteAtEnd(head);
        printList(head);
        head = deleteAtEnd(head);
        printList(head);
        head = deleteAtEnd(head);
        printList(head);
    }
}
