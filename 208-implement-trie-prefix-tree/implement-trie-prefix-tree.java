


    public class node {
        node child[] = new node[26];
        boolean endOFWord;

        node() {
            for (node n : child) {
                n = null;
            }
            endOFWord = false;
        }
    }
class Trie {




  static node root = new node();  
    public Trie() {
    root =new node();
    }
      
    public void insert(String s) {
         node cur = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                node n = new node();
                cur.child[idx] = n;
            }
            cur = cur.child[idx];
        }
        cur.endOFWord = true;
    }
    
    public boolean search(String s) {
         node cur = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                return false;
            }
            cur = cur.child[idx];
        }
        return cur.endOFWord;
    }
    
    public boolean startsWith(String s) {
         node cur = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                return false;
            }
            cur = cur.child[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */