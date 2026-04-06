class Solution {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(0, candidates, target, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start, int[] nums, int target,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {

            // ⭐ Duplicate Skip Logic
            if (i > start && nums[i] == nums[i - 1])
                continue;

            if (nums[i] > target)
                break;

            current.add(nums[i]);

            // Move forward → element used once
            backtrack(i + 1, nums, target - nums[i], current, result);

            current.remove(current.size() - 1);
        }
    }
}
