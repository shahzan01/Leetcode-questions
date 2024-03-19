class Solution {
    public int leastInterval(char[] tasks, int n) {
        

             int freq[] = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            char c = tasks[i];
            freq[c - 'A']++;
        }

        Arrays.sort(freq);
    
        int max=freq[25];
        int blank=(max-1)*n;
for(int i=freq.length-2;i>=0;i--){
if(freq[i]==0){break;}
blank-=Math.min(freq[i], max-1);

}
return tasks.length+Math.max(blank, 0);
    }

}