class Solution {
    
    static boolean check(int f1[],int f2[]){
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]){return false;}
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){return false;}
int freq1[]=new int[26];
for(int i=0;i<s1.length();i++){
    freq1[s1.charAt(i)-'a']++;
}
boolean ans=false;
int len=s1.length();
int freq2[]=new int[26];
for(int i=0;i<len;i++){
    freq2[s2.charAt(i)-'a']++;
}
if(check(freq1, freq2)){return true;}
int j=0;
for(int i=len;i<s2.length();i++){
freq2[s2.charAt(i)-'a']++;
freq2[s2.charAt(j)-'a']--;
j++;
if(check(freq1, freq2)){return true;}
}

return false;

    }
}