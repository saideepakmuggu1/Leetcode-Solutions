class Solution
{
    public int strStr(String haystack, String needle)
    {
        
        if(needle.length()>haystack.length())
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