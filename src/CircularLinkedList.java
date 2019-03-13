public class CircularLinkedList {
}
punlic void print(){
    Node temp = head;
    do{
        System.out.println(" " + temp.data);
        temp=temp.next;
        }
    while(temp != head)
        System.out.println("");
        }

        public void addNodeToNodeHead(int data){
    Node n = new Node(data);
    if (size == 0){
        head = n;
        tail = n;
        n.next = head;
        else
            Node temp = head;
        n.next = temp;
        head = n;
        tail.next = head;
        }
        }

