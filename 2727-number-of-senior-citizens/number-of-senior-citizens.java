class Solution { static int hel(String s) {

       if(s.charAt(11)>'6'){return 1;}
       else if(s.charAt(11)=='6' && s.charAt(12) >'0'){return 1;}
return 0;
    }
    public int countSeniors(String[] arr) {
       int ans=0;
       for(int i=0;i<arr.length;i++){
    ans+=hel(arr[i]);
}
return ans; 
    }
}