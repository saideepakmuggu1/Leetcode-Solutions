class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int len=0;
        int maxlen=0;
        for(int i=0;i<n;i++)
        {
            String ans="";
            for(int j=i;j<n;j++)
            {
                char ch=s.charAt(j);
                if(!(ans.contains(String.valueOf(ch))))
                {   
                       ans=ans+ch;
                       len=ans.length();
                       maxlen=Math.max(len,maxlen);
                }
                else
                    break;
            }
        }
        return maxlen;
    }
}