class Solution {
    public int jump(int[] nums) {
       int jumps = 0;
        int currentEnd = 0;   // last index reachable with `jumps` jumps
        int farthest = 0;     // farthest index reachable with `jumps + 1` jumps

        // Stop at n - 2: once we can reach the last index we never need to jump from it
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {     // exhausted this level, must jump
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}