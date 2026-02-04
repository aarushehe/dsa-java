package linkedlists;

public class printAndAddition {

    static class Node{
        int data;
        Node next;

        Node(int value){
            this.data = value;
            this.next = null;
        }
    }

    static Node insertAtEnd(Node head, int value){
        Node newNode = new Node(value);

        if(head == null){
            return newNode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static Node insertAtFront(Node head, int value){
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    static Node insertAtPosition(Node head, int value, int position){
        if(position == 1){
            return insertAtFront(head, value);
        }

        Node newNode = new Node(value);

        Node temp = head;

        for(int i = 1; i < position - 1 && temp != null; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static void printList(Node head){
        Node temp = head;
        while(temp!= null){
            if(temp.next == null){
                System.out.println(temp.data);
                break;
            }
            System.out.print(temp.data + "  -->  ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;

        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);

        head = insertAtFront(head, 0);

        head = insertAtPosition(head, 15, 3);

        printList(head);
    }
}
