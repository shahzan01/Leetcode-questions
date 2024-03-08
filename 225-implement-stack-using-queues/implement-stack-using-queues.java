class MyStack {
    static int size=0;
  Queue<Integer> q=new LinkedList<>();
        
    public MyStack() {
      size=0;  
    }
    
    public void push(int x) {
        
         if(size==0){q.add(x);size++;}
         else{ Queue<Integer> q2=new LinkedList<>();
while(  !q.isEmpty()){
    q2.add(q.poll());
}
q.add(x);
size++;
while(  !q2.isEmpty()){
    q.add(q2.poll());
}
         }
    }
    
    public int pop() {
         size--;
       return q.poll(); 
      
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(size==0){return true;}
        return false;
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