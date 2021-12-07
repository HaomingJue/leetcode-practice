class MyLinkedList {
    
    private int val;
    private Node head;
    private Node next;
    
    private class Node {
        int val;
        Node next;
        
        Node() {};
        Node(int val) {
            this.val = val;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public MyLinkedList() {
        head = new Node();
    }
    
    public int get(int index) {
        Node cur = head;
        for (int i = 0; i <= index ; i++) {
            if (cur.next == null) return -1;
            cur = cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
    }
    
    public void addAtTail(int val) {
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        Node node = new Node(val);
        cur.next = node;
    }
    
    public void addAtIndex(int index, int val) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            if (cur.next == null && i != index) return;
            cur = cur.next;
        }
        Node node = new Node(val, cur.next);
        cur.next = node;
    }
    
    public void deleteAtIndex(int index) {
        Node cur = head;
        if (cur.next == null) return;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
            if (cur.next == null) return;
        }
        cur.next = cur.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


