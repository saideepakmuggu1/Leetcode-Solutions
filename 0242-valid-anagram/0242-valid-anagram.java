class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0;i<m;i++)
        {
            char d=t.charAt(i);
            hm.put(d,hm.getOrDefault(d,0)-1);
            if(hm.get(d)==0)
                hm.remove(d);
        }
        return hm.isEmpty();
    }
}