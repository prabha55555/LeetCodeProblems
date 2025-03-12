class MinStack {
     Stack<Integer> main;
 Stack<Integer>  norm;

    public MinStack() {
        
        main = new Stack<>();
        norm = new Stack<>();
        
    }
    
    public void push(int val) {
            
            main.push(val);
            if(norm.isEmpty() || val <=norm.peek()){
                norm.push(val);
            }
                
    }
    
    public void pop() {

        if(main.pop().equals(norm.peek())){
            norm.pop();
        }
        
    }
    
    public int top() {

        return main.peek();       
    }
    
    public int getMin() {

       return  norm.peek();
        
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