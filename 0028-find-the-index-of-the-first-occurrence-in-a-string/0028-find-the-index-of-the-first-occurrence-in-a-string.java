class Solution
{
    public int strStr(String haystack, String needle)
    {
        int n=haystack.length();
        int m=needle.length();
        if(m>n)
        {
             return -1;
        }
        if(haystack.contains(needle))
        {
            return haystack.indexOf(needle);
        }
        else
            return -1;
    }
}