class 383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        ransomNote.replaceAll(" ", "");
        magazine.replaceAll(" ", "");
        
        for(int i =0; i < magazine.length(); i++)
        {
            map.compute(magazine.charAt(i), (k,v) -> v == null ? 1 : v+1);
        }
        
        for(int i =0; i< ransomNote.length(); i++)
        {
            if(map.containsKey(ransomNote.charAt(i)))
            {
                Integer value = map.get(ransomNote.charAt(i));
                if(value > 0)
                {
                    map.put(ransomNote.charAt(i), value -1);    
                }
                else
                {
                    return false;
                }
                
            }
            else
            {
               return false;  
            }
                       
        }
        return true;
    }
}