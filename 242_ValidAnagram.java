class 242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
     
        if(s.length() != t.length() || s == null || t ==null) return false;
        
       // char charArray[] = str.toCharArray();
        char str[]= s.toCharArray();
        Arrays.sort(str);
        
        char t_arr[] = t.toCharArray();
        Arrays.sort(t_arr);
        
        for(int i = 0; i<s.length(); i++)
        {
            if(str[i] != t_arr[i])
              return false;
        }
        return true;
        
    }
}