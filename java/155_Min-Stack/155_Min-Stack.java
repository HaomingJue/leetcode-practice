class MinStack {
    Node topNode;
    
    private class Node {
        int val;
        int minVal;
        Node next;
        
        Node(int val, int minVal, Node next) {
            this.val = val;
            this.minVal = minVal;
            this.next = next;
        }
    }

    public MinStack() {
        
    }
    
    public void push(int val) {
        Node node = new Node(val, topNode == null ? val : Math.min(val, topNode.minVal), topNode);
        topNode = node;
    }
    
    public void pop() {
        topNode = topNode.next;
    }
    
    public int top() {
        return topNode.val;
    }
    
    public int getMin() {
        return topNode.minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */