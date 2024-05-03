class Solution {
    public int compareVersion(String v1, String v2) {
       int ve1[] = new int[500];
        int ve2[] = new int[500];

        int n = v1.length();
        int m = v2.length();
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (i < n && j < m) {
            if (v1.charAt(i) == '.') {
                ve1[k] = Integer.parseInt(sb1.toString());
                i++;
                k++;
                sb1.setLength(0);
            } else {
                sb1.append(v1.charAt(i));
                i++;

            }
            if (v2.charAt(j) == '.') {
                ve2[l] = Integer.parseInt(sb2.toString());
                j++;
                l++;
                sb2.setLength(0);
            } else {
                sb2.append(v2.charAt(j));
                j++;
            }

        }
        while (i < n) {
            if (v1.charAt(i) == '.') {
                ve1[k] = Integer.parseInt(sb1.toString());
                i++;
                k++;
                sb1.setLength(0);
            } else {
                sb1.append(v1.charAt(i));
                i++;

            }

        }
        while (j < m) {
            if (v2.charAt(j) == '.') {
                ve2[l] = Integer.parseInt(sb2.toString());
                j++;
                l++;
                sb2.setLength(0);
            } else {
                sb2.append(v2.charAt(j));
                j++;
            }
        }
        ve2[l] = Integer.parseInt(sb2.toString());
        ve1[k] = Integer.parseInt(sb1.toString());
  int   ans=0; 
for( i=0;i<ve1.length;i++){
if(ve1[i]>ve2[i]){ans=1;break;}
if(ve1[i]<ve2[i]){ans=-1;break;}
}
return ans;
  
    }
}