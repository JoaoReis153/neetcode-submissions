class MinStack {
    
    Stack<Integer> s;
    Stack<Integer> min; 

    public MinStack() {
        this.s = new Stack<Integer>();
        this.min = new Stack<Integer>();
    }
    
    public void push(int val) {
        if (!min.isEmpty() && min.peek() >= val) min.push(val);
        else if (min.isEmpty()) min.push(val);
        s.push(val);
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
        if (min.isEmpty()) return 0;
        return min.peek();
    }
}
