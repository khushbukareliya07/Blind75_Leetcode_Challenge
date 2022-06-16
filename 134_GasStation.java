class 134_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        //we will check if total sum of gas arrray >= total sum of the Cost array
        //if yes, then solution exists, 
        //otherwise we run out of gas and solution doesn't exist.
        int Tgas =0, Tcost =0;
        
        for(int i=0; i< gas.length; i++)
        {
            Tgas += gas[i];
            Tcost += cost[i];
        }
        
        if(Tgas < Tcost) return -1; //we run out of gas, solution does not exist. 
        
        int total = 0, startingIndex =0;
        
        for(int i=0; i<gas.length; i++)
        {
            total = total + gas[i] - cost[i];
            
            if(total <0)
            {
                //this index will not work and we reset total and change the start index. 
                total =0;
                startingIndex = i+1;
            }
            
        }
        return startingIndex;
    }
}