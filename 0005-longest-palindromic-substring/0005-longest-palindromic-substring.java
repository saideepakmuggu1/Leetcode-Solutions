class Solution 
{
    public String longestPalindrome(String s) 
    {
        int st=0;
        int len=1;
        int n=s.length();
        int start=0;
       while (st < n)
       {
            int end = n - 1;
            while (st < end)
            {
                if (s.charAt(st) == s.charAt(end))
                {
                    
                    if (longp(s, st, end)) 
                    {
                        
                        if ((end - st + 1) > len)
                        {
                            start = st;
                            len = end - st + 1;
                        }
                    }
                }
                end--;  
            }
            st++;  
        }
        
        
        return s.substring(start, start + len);
  }
    public boolean longp(String s,int st,int end)
    {
        int len=Integer.MIN_VALUE;
         while(st<=end)
         {
             if(s.charAt(st) != s.charAt(end))
             {
                return false;
             }
             st++;
             end--;
             
         }
        return true;
    }
}