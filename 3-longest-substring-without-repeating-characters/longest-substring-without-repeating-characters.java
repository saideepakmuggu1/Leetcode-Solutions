import java.util.HashMap;

class Solution 
{
    public int lengthOfLongestSubstring(String s)
     {
    
        HashMap<Character,Integer> map = new HashMap<>();
        int mlen = 0;
        int left = 0;
        int right = 0;
        while(right < s.length())
        {
            char c = s.charAt(right);
            if(!map.containsKey(c))
            {
                map.put(c,right);
            }
            else if(map.containsKey(c))
             {
                 left = Math.max(left,map.get(c)+1);
                 map.put(c,right);
             }
            mlen = Math.max(mlen,right-left+1);
            right++;
        }
        return mlen;
    }
}   
    
