class Solution 
{
    public String removeOuterParentheses(String s)
    {
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == '(') 
            {
                if (cnt > 0)
                {
                    res.append(arr[i]);
                }
                cnt++;  
            } 
            else 
            {
                cnt--;  
                if (cnt > 0)
                {
                    res.append(arr[i]);
                }
            }
        }
        return res.toString();
    }
}