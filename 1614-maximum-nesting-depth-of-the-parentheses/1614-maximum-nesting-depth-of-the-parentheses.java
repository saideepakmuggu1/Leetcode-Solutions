class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int maxi=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch == '(' )
            {
                cnt++;
                 maxi=Math.max(maxi,cnt);
            }
            else if(ch == ')')
            {
    
                cnt--;
            }
            else
                continue;
        }
        return maxi;
    }
}