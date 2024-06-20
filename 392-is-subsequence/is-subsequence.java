class Solution {
    public boolean isSubsequence(String s, String t) {
            if(s.length()==0){return true;}
        if(t.length()==0 || t.length()<s.length()){return false;}
        int idx=0;
for(int i=0;i<s.length();i++){
      if(idx>=t.length()){return false;}
    char cur=s.charAt(i);
while (idx<t.length() &&  t.charAt(idx)!=cur) { if(idx==t.length()-1){return false;}
    idx++;
}
if(t.charAt(idx)!=cur){return false;}
else{
    idx++;
}



}return true;
    }
}