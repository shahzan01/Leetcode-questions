class Solution {
    static class trie{
        trie child[];
        int c;
        trie(){
            this.child=new trie[26];
            for(int i=0;i<26;i++){
                child[i]=null;
            }
            this.c=1;
        }
    }
    static trie root;
static void add(String s){
trie cur=root;
for(int i=0;i<s.length();i++){
    int idx=s.charAt(i)-'a';
    if(cur.child[idx]!=null){cur=cur.child[idx];cur.c++;}
    else{
        trie n=new trie();
        cur.child[idx]=n;
        cur=cur.child[idx];
    }
}
}
static int get(String s){
    trie cur=root;
    int ans=0;
    for(int i=0;i<s.length();i++){
        int idx=s.charAt(i)-'a';
if(cur.child[idx]==null){break;}
else{
    cur=cur.child[idx];
    ans+=cur.c;
}


    }
    return ans;
}


    public int[] sumPrefixScores(String[] words) {
        root=new trie();
        int a[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            add(words[i]);
        }
         for(int i=0;i<words.length;i++){
          a[i]=get(words[i]);
        }
        return a;
    }
}