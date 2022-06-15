class 56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
             
        int[] prev = intervals[0];

        if(intervals.length == 1)
            return intervals;
        
        Arrays.sort(intervals, (row, col) -> row[0] - col[0]); //log n
        
        List<int[]> output = new ArrayList();
        int count =0;
        for(int[] next : intervals)
        {
            if(count == 0)
            {
                prev = next;
                count++;
                
            }
            else
            {   
                if(next[0] > prev[1]) //no overlapping
                {
                    //push prev to arraylist,
                    output.add(prev);
                    //reassign prev with Next element
                    prev = next;
                }
                else //overlapping present
                {
                    prev[0] = Math.min(prev[0], next[0]);
                    prev[1] = Math.max(prev[1], next[1]);
                }
                count++;
            }
              if(count == intervals.length)
            {
                output.add(prev);
            }
            
        }
        
        //for loop ends here
        return output.toArray(new int[output.size()][2]);
        
    }
}