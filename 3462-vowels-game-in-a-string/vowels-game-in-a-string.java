class Solution {    static boolean fxn(String s) {
HashSet<Character>hs=new HashSet<>();
hs.add('a');
hs.add('e');
hs.add('i');
hs.add('o');
hs.add('u');
int coun=0;
for(int i=0;i<s.length();i++){
    if(hs.contains(s.charAt(i))){coun++;}
}
if(coun==0){return false;}
return true;

    }
    public boolean doesAliceWin(String s) {
        return fxn(s);
    }
}