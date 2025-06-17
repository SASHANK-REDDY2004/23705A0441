public class Stacks_using_LinkedList {
    public static void main(String args[]) {
        Stack l1 = new Stack();
        l1.push(20);
        l1.push(30);
        l1.push(40);
        l1.print();

        System.out.println("Popped: " + l1.pop());
        l1.print();

        System.err.println("Peek: " + l1.peek());
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

class Stack {
    Node top;

    Stack() {
        this.top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (isEmpty()) {
            System.err.println("Stack is empty, cannot pop");
            return -1; // Or throw exception
        }
        int removedEle = top.data;
        top = top.next;
        return removedEle;
    }

    int peek() {
        if (isEmpty()) {
            System.err.println("Stack is empty, cannot peek");
            return -1; // Or throw exception
        }
        return top.data;
    }

    void print() {
        Node temp = top;
        System.out.print("Stack elements (top to bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
