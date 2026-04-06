class Solution {
    public int maxArea(int[] height) {
           int left = 0, right = height.length - 1;
    int max = 0;

    while (left < right) {
        // overflow if the height is more than minimum
        int h = Math.min(height[left], height[right]);
        int w = right - left;
        max = Math.max(max, h * w);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max;
    }
}
