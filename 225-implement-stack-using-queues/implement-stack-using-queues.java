class MyStack {
    static int size=0;
  Queue<Integer> q=new LinkedList<>();
        
    public MyStack() {
      size=0;  
    }
    
    public void push(int x) {
        
         if(size==0){q.add(x);size++;}
         else{ q.add(x);size++;
          for (int i = 0; i < size-1; i++) {
            q.add(q.poll());
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