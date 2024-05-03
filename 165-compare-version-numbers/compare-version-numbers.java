class Solution {
    public int compareVersion(String v1, String v2) {
            String ve1[] = v1.split("\\.");
        String ve2[] = v2.split("\\.");

     int idx=Math.max(ve1.length, ve2.length);
     for(int i=0;i<idx;i++){
       int n1=i<ve1.length?Integer.parseInt(ve1[i]):0;
        int n2=i<ve2.length?Integer.parseInt(ve2[i]):0;
        if(n1>n2){return    1;}
if(n1<n2){return -1;}
     }
       
return 0;
    }
}