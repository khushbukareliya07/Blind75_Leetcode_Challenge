class 125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        
        if(s== null || s.length() == 0)
            return true;
        
     
        int left =0, right= s.length()-1;
            
        
        while(left<=right)
        {
            if(!Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
                continue; // you run this untill you reach to an actual character
            }
            if(!Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
                continue; // you run this untill you reach to an actual character
            }
            
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
          right--;
          left++;
            
        }
        return true;
    }
}