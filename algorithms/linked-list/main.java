// Online Java Compiler
class Main {
    public static void main(String[] args) {
        Node node = new Node(5);
        System.out.println(node.data + " " + node.next);
        
        Node nextNode = new Node(3);
        node.next = nextNode;
        
        LinkedListAppend linkedList = new LinkedListAppend(node);
        
        System.out.println(linkedList.head.data);
        linkedList.append(12);
        
        linkedList.append(8);
        linkedList.printAll();
    }
}

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListAppend {
    Node head;
    
    public LinkedListAppend(Node node) {
        this.head = node;
    }
    
    public void append(int value) {
        Node cur = head;
        while(!cur.next.equals(null)) {
            cur = cur.next;
        }
        cur.data = value;
    }
    
    public void printAll() {
        Node cur = head;
        while(!cur.next.equals(null)) {
            System.out.println(cur.data);
        }
    }
}
