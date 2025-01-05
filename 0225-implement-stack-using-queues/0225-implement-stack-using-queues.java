class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1=new ArrayDeque<>();
        q2=new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if(q1.isEmpty())return -1;
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        int temp=q1.poll();
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        return temp;
    }
    
    public int top() {
        if(q1.isEmpty())return -1;
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        int temp=q1.peek();
        q2.add(q1.poll());
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        return temp;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */