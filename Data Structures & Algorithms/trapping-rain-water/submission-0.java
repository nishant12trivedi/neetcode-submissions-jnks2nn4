class Solution {
    public int trap(int[] height) {
        int l=height.length;
        int[] lmax= new int[l];
        int[] rmax= new int[l];  
        int water=0;

        lmax[0]=height[0];
        for(int i=1;i<l;i++)
        lmax[i] = Math.max(lmax[i-1],height[i]);

        rmax[l-1]=height[l-1];
        for(int i=l-2;i>=0;i--)
        rmax[i] = Math.max(rmax[i+1],height[i]);

        for(int i=0;i<l;i++)
        water += Math.min(rmax[i],lmax[i])-height[i];

        return water;
    }
}
