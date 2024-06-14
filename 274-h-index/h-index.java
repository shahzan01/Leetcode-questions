class Solution {
    static boolean hasAtLeastHPapersWithHCitations(int h, int[] citations) {
        int count = 0;
        for (int cite_count : citations) {
            if (cite_count >= h)
                count++;
        }
        return count >= h;
    }
    public int hIndex(int[] citations) {
        int low = 0, high = citations.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (hasAtLeastHPapersWithHCitations(mid, citations))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }
}