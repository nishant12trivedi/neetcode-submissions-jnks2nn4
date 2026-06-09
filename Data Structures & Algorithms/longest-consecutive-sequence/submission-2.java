class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<Integer>();        
        int longest=0,c=1,inc;
        for (int i : nums)
        {
            map.add(i);
        }
      for(int j : map)
        {
            if(map.contains(j-1))
            {
             c=1; inc=j;   
                while(true)
                {
                    if(!map.contains(inc))
                     break;    
                    c++; inc++;
                }
            }
            longest = Math.max(longest, c);
        }
        return longest;
    }
}
