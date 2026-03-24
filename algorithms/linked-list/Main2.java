class Main2 {
    public static void main(String[] args) {
        
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

class LinkedList {
    Node head;
    public LinkedList(Node node) {
        head = node.next;
    }//어떻게 연결하는지 모르겠음
    //node(data, node(data, node(...))))이 구조 인가?
    public void append(int value) {
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        //cur = new Node(value);//이런다고 연결 되는게 아니 잖슴
        cur.next = new Node(value);
    }
}
