class MyCircularDeque {
 Deque<Integer>q;
 int s;
    public MyCircularDeque(int k) {
        this.q=new LinkedList<>();
        this.s=k;
    }
    
    public boolean insertFront(int v) {
        if(this.q.size()>=this.s){return false;}
         this.q.addFirst(v);
         return true;
      
    }
    
    public boolean insertLast(int v) {
          if(this.q.size()>=this.s){return false;}
           this.q.addLast(v);
           return true;
    }
    
    public boolean deleteFront() {
          if(this.q.size()==0){return false;}
          this.q.removeFirst();
          return true;
    }

    public boolean deleteLast() {
          if(this.q.size()==0){return false;}
            this.q.removeLast();
            return true;
        
    }
    
    public int getFront() {
         if(this.q.size()==0){return -1;}
         return    this.q.getFirst();
    }
    
    public int getRear() {
         if(this.q.size()==0){return -1;}
         return    this.q.getLast();
    }
    
    public boolean isEmpty() {
        
      
      return   this.q.isEmpty();
    }
    
    public boolean isFull() {
        if(this.q.size()==this.s){return true;}
        return false; 
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */