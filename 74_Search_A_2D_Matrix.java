//Approach - consider matrix as 1d array an dfind mid, then find corresponding row and column index and then apply binary search as usual. 
//time Complexity -  log(row*col)
//Space Complexity -  O(1) --  no auxilliary space used. 

class 74_Search_A_2D_Matrix {
    
    
    private int calculateMid(int low, int high)
    {
        return low + (high-low)/2;
    }
    
    private int findRowIndex(int mid, int n)
    {
        //division to get row index
        return mid/n;
    }
     private int findColIndex(int mid, int n)
    {
        //modulo to get column index
        return mid%n;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) 
    {
              
        //null check
        if(matrix == null || matrix.length == 0) return false;
        
        
        int m = matrix.length; //gives row
        int n = matrix[0].length;//gives column
        
        int low = 0, high = (m*n)-1;
        int row_idx =0, col_idx = 0;
        
                
        while(low <= high)
        {
            int mid = calculateMid(low, high);
            
            //find index for the corresponding MID in Matrix
                       
            row_idx = findRowIndex(mid, n);
            col_idx = findColIndex(mid, n);
            
            //check if mid== target, return
            if(matrix[row_idx][col_idx] == target)
            {
                return true;
            }

            //check if mid < target, update high
            else if(matrix[row_idx][col_idx] < target)
            {
                low  = mid+1;
            }
            else
            {
                high = mid -1;
            }
            
            //obvious mid > target, update low
        }
        
        return false;
        
    }
}