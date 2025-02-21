class Solution 
{
    public String largestNumber(int[] nums) 
    {
        StringBuilder s = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for(int i:nums)
        {
            list.add(Integer.toString(i));
        }
        Collections.sort(list, (a, b) -> (a + b).compareTo(b + a));

        for(int i=list.size()-1;i>=0;i--)
          s.append(list.get(i));
        if(s.charAt(0) == '0')
          return "0";

          return s.toString();


    }
}