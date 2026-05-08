class MinStack {
    
    Stack<Integer> s;
    Stack<Integer> min; 

    public MinStack() {
        this.s = new Stack<Integer>();
        this.min = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if (min.isEmpty() || min.peek() >= val) min.push(val);
    }
    
    public void pop() {
        if (s.isEmpty()) return;
        if (!min.isEmpty() && min.peek().equals(s.peek())) min.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
