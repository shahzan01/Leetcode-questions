class Solution {
    
    static void dbg(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
static  class pair1{
int chair;
int leaveTime;
  public pair1(int c,int l){
    this.chair=c;
    this.leaveTime=l;
  }
}

static int hel(int times[][],int target){
HashMap<Integer,Integer>hm=new HashMap<>();
PriorityQueue<pair1>pq=new PriorityQueue<>((a,b)->{
    if(a.leaveTime==b.leaveTime){
        System.out.println("sdfklsdklhjfkl");
        return a.chair-b.chair;
    }

return a.leaveTime-b.leaveTime;
});
PriorityQueue<Integer>chairq=new PriorityQueue<>();
for(int i=0;i<times.length;i++){
hm.put(times[i][0], i);
chairq.add(i);
}
int ans=-1;
Arrays.sort(times,(a,b)->{
   return a[0]-b[0];
});


for(int i=0;i<times.length;i++){
 int at=times[i][0];
 int lt=times[i][1];
 int idx=hm.get(at);

while(!pq.isEmpty() &&(pq.peek().leaveTime<=at)){
chairq.add(pq.poll().chair);
}
if(idx==target){return chairq.peek();}
pq.add(new pair1(chairq.poll(), lt));




}


return -1;



}


    public int smallestChair(int[][] times, int tar) {
        return hel(times,tar);
    }
}