class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        Map<Character,Character> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(hm.containsKey(c))
            {
                if(hm.get(c)!=d)
                     return false;
            }
            else
            {
               if(hm.containsValue(d))
               {
                   
                       return false;
               }
            }
            hm.put(c,d);
            
        }
        return true;
    }
}