class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int max = nums[0], i=0;
        int[] arr = new int[nums.length-k+1];

        for(int j=0;j<= nums.length - k;j++)
        {
            int l=0;
            max = nums[j];
            while(l<k)
            {
                max = Math.max(max,nums[j+l]);
                ++l;
            }
              arr[j] = max;
        }
        return arr;
    }
}
