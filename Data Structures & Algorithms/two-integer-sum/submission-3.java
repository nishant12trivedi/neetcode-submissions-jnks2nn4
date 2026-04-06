class Solution {
    public int[] twoSum(int[] nums, int target) {

	 int complement;
	 HashMap<Integer, Integer> hs = new HashMap<>();
	 for(int j=0; j<nums.length; j++)
	 {complement = target - nums[j];
		 if(hs.containsKey(complement))
		 {
			 return new int[]{hs.get(complement), j};
		 }
	 hs.put(nums[j], j);
	 }
	 return new int[]{-1, -1};  // Not found
    }
}
