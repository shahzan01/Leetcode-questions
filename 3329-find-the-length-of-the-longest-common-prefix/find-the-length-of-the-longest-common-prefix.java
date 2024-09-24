class Solution {

static class trie{
    trie[] child;
    boolean eow;
    trie(){
        child=new trie[10];
        for(int i=0;i<10;i++){
            child[i]=null;
        }
eow=false;
    }
}

static trie root;
static void add(String  s){

    trie cur=root;
for(int i=0;i<s.length();i++){
    int idx=s.charAt(i)-'0';
    if(cur.child[idx]!=null){
cur=cur.child[idx];
    }
    else{
        trie n=new trie();
        cur.child[idx]=n;
        cur=cur.child[idx];
    }
}
cur.eow=true;


}
static int search(String s){
int ans=0;

trie cur=root;
for(int i=0;i<s.length();i++){
    int idx=s.charAt(i)-'0';
    if(cur.child[idx]!=null){cur=cur.child[idx];ans++;}
    else{
        break;
    }

}

return ans;
}


    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        root=new trie();


for(int i=0;i<arr2.length;i++){
String s=String.valueOf(arr2[i]);
add(s);
}
int ans=0;
for(int i=0;i<arr1.length;i++){
String s=String.valueOf(arr1[i]);
int n=search(s);

ans=Math.max(ans,n);
}
return ans;
    }
}