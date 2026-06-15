class Solution {
    public int lengthOfLongestSubstring(String s) {   
        HashSet<Character> str= new  HashSet<>();
        int left=0,maxl=0;
        for(int i=0;i<s.length();i++)
        {
            while(str.contains(s.charAt(i)))
            {
                str.remove(s.charAt(left));
                left++;
            }
            str.add(s.charAt(i));
            maxl =  Math.max( maxl , i-left+1);
        }
      
       return maxl;
    }
}

