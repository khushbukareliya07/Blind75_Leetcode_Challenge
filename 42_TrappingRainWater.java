class 42_TrappingRainWater {
    public int trap(int[] height) {
        
        int n = height.length;
        if(n <=2) return 0;
        
        int max1 = height[0];
        int max2 = height[n-1];
        int lmax[] = new int [n];
        int rmax[] = new int [n];
        int i= 0, j=0;
        
        for(i = 0,j = n-1; i<n && j>=0; i++, j--)
        {
            max1 = Math.max(height[i], max1);
            max2 = Math.max(height[j], max2);
            lmax[i] = max1;
            rmax[j] = max2;
        }
        int area = 0;
        for(i = 0; i <n; i++)
        {
            area += Math.min(lmax[i], rmax[i]) - height[i];
        }
        return area;
    }
}