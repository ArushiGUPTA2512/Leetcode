class MinStack {

    static class Pair{
        int value, min;
        Pair(int value, int min){
            this.value = value;
            this.min = min;
        }
    }
    Stack<Pair> s;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int value) {
        if(s.isEmpty())
            s.push(new Pair(value, value));
        else{
            int minVal = Math.min(value, s.peek().min);
            s.push(new Pair(value, minVal));
        }
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
       return s.peek().value;
    }
    
    public int getMin() {
        return s.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */