import java.util.LinkedList;

public class CircularLinkedList {
    int size = 0;
    Node Head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getnext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;

        }

        public void print() {
            Node temp = Head;
            do {
                System.out.println(" List Is Empty "); //+ temp.data/*);
                temp = temp.next;
            }
            while (temp != Head) {
                System.out.println(" ");
            }
        }

        public void addNodeToHead(int data) {
            Node n = new Node(data);
            if (size == 0) {
                Head = n;
                tail = n;
                n.next = Head;
            } else {
                Node temp = Head;
                n.next = temp;
                Head = n;
                tail.next = Head;
            }
            size++;
        }

        public void addNodeToTail(int data) {
            if (size == 0) {
                addNodeToHead(data);
            } else {
                Node node = new Node(data);
                tail.next = node;
                size++;
            }
        }


                LinkedList.print()
                LinkedList.addNodeToTail(45)
                LinkedList.print()
                LinkedList.deleteHead()
                LinkedList.print()
    }
    public static void main(String[] args) {
        CircularLinkedList LinkedList = new CircularLinkedList();
        for (int i = 0; i < 5; i++) {
            LinkedList.addNodeToHead(i + 1);

        }
    }
    public void deleteHead() {
        if (size != 0)
            Node temp = Head;
        Head = Head.next;
        tail.next = Head;
        size--;
    }
}

