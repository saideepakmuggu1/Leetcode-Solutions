import java.util.*;

class Solution {
    public String frequencySort(String s) {
           Map<Character,Integer> hm=new HashMap<>();
           StringBuilder sb=new StringBuilder();
           for(int i=0;i<s.length();i++)
           {
               char c=s.charAt(i);
               hm.put(c,hm.getOrDefault(c,0)+1);
           }
        List<Character> ch=new ArrayList<>(hm.keySet());
        ch.sort((a,b) -> hm.get(b) - hm.get(a));
        for(char c:ch)
        {
            int f=hm.get(c);
            for(int i=0;i<f;i++)
                sb.append(c);
        }
        return sb.toString();
    }
}