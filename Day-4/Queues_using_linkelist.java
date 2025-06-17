public class Queues_using_linkelist {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.print();
        q.dequeue();
        q.print();
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

class QueueLL {
    Node head;
    Node rear;

    QueueLL() {
        this.head = null;
        this.rear = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void enqueue(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int val = head.data;
            head = head.next;
            if (head == null) {  
                rear = null;
            }
            return val;
        }
    }

    void print() {
        Node temp = head;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int length() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    int getHead() {
        if (head != null) {
            return head.data;
        }
        System.out.println("Queue is empty");
        return -1;
    }
}
