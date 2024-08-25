class Solution {
    public int romanToInt(String s)
    {
        int n=s.length();
        int sum=0;
        Map<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        for(int i=0;i<n;i++)
        {
            int val=hm.get(s.charAt(i));
            if(i+1 < n && hm.get(s.charAt(i)) < hm.get(s.charAt(i+1)))
            {
                sum=sum-val;
            }
            else
                sum=sum+val;
        }
        return sum;
    }
}