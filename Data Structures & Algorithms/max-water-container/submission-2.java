class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxWtr = Integer.MIN_VALUE;
        int left = 0;
        int right = n-1;
        while(left < right){
            int wth = right - left;
            int ht = Math.min(heights[left], heights[right]);
            int area = wth * ht;
            maxWtr = Math.max(maxWtr , area);
            if(heights[left] < heights[right]){
                left ++;
            }
            else{
                right --;
            } 
        }
        return maxWtr;
    }
}
