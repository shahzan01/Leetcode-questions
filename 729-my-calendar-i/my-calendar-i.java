class MyCalendar {
     List<int[]> li ;
    public MyCalendar() {
      this.li= new ArrayList<>();
    }
    
    public boolean book(int s, int e) {
      
    for(int i=0;i<this.li.size();i++){
        int a=this.li.get(i)[0];
        int b=this.li.get(i)[1];
if(s<b && e>a){return false;}


    }
int n[]={s,e};
this.li.add(n);

return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */