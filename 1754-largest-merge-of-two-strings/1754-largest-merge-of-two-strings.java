import java.util.*;
class Solution 
{
    public String largestMerge(String word1, String word2) 
    {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        int n=word1.length();
        int m=word2.length();
        while(i<n || j<m)
        {
            if(i<n &&(j==m || word1.charAt(i) > word2.charAt(j)))
            {
                sb.append(word1.charAt(i));
                i++;
            }
            else if(j<m && (i==n || word1.charAt(i)<word2.charAt(j)))
            {
                sb.append(word2.charAt(j));
                j++;
            }
            else
            {  
                int k=word1.substring(i,n).compareTo(word2.substring(j,m));
                if(k>0)
                {
                    sb.append(word1.charAt(i));
                    i++;
                }
                else
                {
                    sb.append(word2.charAt(j));
                    j++;
                }
            }
        }
           return sb.toString();
            
      }
}
