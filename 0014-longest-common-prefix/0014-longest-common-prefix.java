class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        int n=strs.length;
        String s1=strs[0];
        String s2=strs[n-1];
        int n1=s1.length();
        for(int i=0;i<n1;i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
                sb.append(s1.charAt(i));
            else
                break;
        }
        return sb.toString();
    }
}