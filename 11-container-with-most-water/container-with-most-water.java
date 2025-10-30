class Solution {
    public int maxArea(int[] height) {
        int area = 0;

       int left = 0;
       int right = height.length-1;

       while(left<right){
            int minValue = Math.min(height[left],height[right]);
            int diff = right - left;

            int distance = minValue * diff;

            area = Math.max(distance,area);


            if(height[left]<height[right]){
                left++;
            }else
                right--;
            


       }

        return area;
    }
}