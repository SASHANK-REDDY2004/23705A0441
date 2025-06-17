public class Linked_list1 {
    public static void main(String[] args) {
        System.out.println("Program started");

        LinkedList list = new LinkedList();
        System.out.println("Created list");

        list.insertBeg(10);
        list.insertBeg(20);
        list.insertBeg(30);
        list.insertBeg(40);
        System.out.println("Inserted elements at beginning");

        int removed = list.deletePos(1);
        System.out.println("Deleted element at pos 1: " + removed);

        list.print();

        list.insertPos(25, 2);
        list.print();

        int removedBeg = list.deleteBeg();
        System.out.println("Deleted from beginning: " + removedBeg);

        int removedEnd = list.deleteEnd();
        System.out.println("Deleted from end: " + removedEnd);

        list.print();

        System.out.println("Program ended");
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void insertBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertPos(int data, int pos) {
        int length = length();
        if (pos < 0 || pos > length) {
            System.out.println("The position is invalid");
            return;
        }
        if (pos == 0) {
            insertBeg(data);
            return;
        }
        if (pos == length) {
            insertEnd(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    int length() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    void print() {
        Node temp = head;
        System.out.print("Elements in the LinkedList are: ");
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    int deleteBeg() {
        if (head == null) {
            System.out.println("There are no elements in list");
            return -1;
        }
        int removedEle = head.data;
        head = head.next;
        return removedEle;
    }

    int deleteEnd() {
        if (head == null) {
            System.out.println("No elements in list");
            return -1;
        }
        if (head.next == null) {
            int removedEle = head.data;
            head = null;
            return removedEle;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int removedEle = temp.next.data;
        temp.next = null;
        return removedEle;
    }

    int deletePos(int pos) {
        int length = length();
        if (pos < 0 || pos >= length) {
            System.out.println("Invalid location");
            return -1;
        }
        if (pos == 0) {
            return deleteBeg();
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        int removedEle = temp.next.data;
        temp.next = temp.next.next;
        return removedEle;
    }
}
