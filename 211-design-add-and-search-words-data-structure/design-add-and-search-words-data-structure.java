class Trie{
    Trie links[]=new Trie[26];
    boolean end=false;
    boolean containsKey(char ch)
    {
        return links[ch-'a']!=null;
    }
    Trie get(char ch)
    {
        return links[ch-'a'];
    }
    void set(char ch,Trie trie)
    {
        links[ch-'a']=trie;
    }
    void setEnd()
    {
        end=true;
    }
    boolean getEnd()
    {
        return end;
    }
}


class WordDictionary {
    Trie root;
    public WordDictionary() {
        root=new Trie();
    }
    
    public void addWord(String word) {
        int i,n=word.length();
        Trie curr=root;
        for(i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            if(!curr.containsKey(ch))
            {
                curr.set(ch,new Trie());
            }
            curr=curr.get(ch);
        }
        curr.setEnd();
    }
    
    public boolean search(String word) {
       return helper(word,root,0);
    }
    public boolean helper(String word,Trie root,int index)
    {
        if(index>=word.length())
            return root.getEnd();
        char ch=word.charAt(index);
        if(ch=='.')
        {
            for(Trie child:root.links)
            {
                if(child!=null && helper(word,child,index+1))
                    return true;
            }
            return false;
        }
        else
        {
            if(root.get(ch)==null)
                return false;
            return helper(word,root.get(ch),index+1);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */