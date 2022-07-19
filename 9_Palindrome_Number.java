class 9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        
        String number = Integer.toString(x);
        int size = number.length();
        if(size == 0 || x <0) return false;
        
                
        int low =0, high = size -1;
        
        while(low <= high)
        {
            if(number.charAt(low) != number.charAt(high))
                return false;
            low++;
            high--;
                
        }
        return true;
    }
}