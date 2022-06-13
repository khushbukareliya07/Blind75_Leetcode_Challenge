class Solution {
	
	public boolean canAttendMeetings(Interval[] interval)
	{
		int[] start = new int[intervals.length];
		int[] end = new int[intervals.length];
		
		for(int i=0; i<intervals.length; i++)
		{
			start[i] = intervals[i].start;
			end[i] = intervals[i].end;
		}
		
		Arrays.sort(start);
		Arrays.sort(end);
		
		for(int i=0; i<starts.length; i++)
		{
			if(start[i+1] < end[i])
				return false;
				
				else
				return true;
		}
	}
}