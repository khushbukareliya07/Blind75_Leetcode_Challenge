class 57_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval)
    {
        if(newInterval == null) return intervals;
        
        int[] temp = newInterval;
        List<int[]> result = new ArrayList();
       
        for(int[] interval : intervals )
        {
            if(temp == null || temp[0] > interval[1]) //interval entry goes to right side
                result.add(interval);
            
            else if(temp[1] < interval[0]) //interval entry goes to left side
            {
                result.add(temp);
                result.add(interval);
                temp =null;
            }
            else
            {
                //merging is needed; 
                temp[0] = Math.min(interval[0], temp[0]);
                temp[1] = Math.max(interval[1], temp[1]);
            }
        }
        
        if(temp != null) result.add(temp);
        
        return result.toArray(new int[result.size()][2]);
        
    }
}
        
       