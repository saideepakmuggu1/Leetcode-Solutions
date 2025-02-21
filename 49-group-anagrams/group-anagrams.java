class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
       List<List<String>> result = new ArrayList<>();
       HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
       for(String s : strs)
       {
          char[] arr = s.toCharArray();
          Arrays.sort(arr);
          String sorted = new String(arr);
          if(hm.containsKey(sorted))
          {
             hm.get(sorted).add(s);
          }
          else
          {
             hm.put(sorted,new ArrayList<>());
             hm.get(sorted).add(s);
          }
       }

        
          for(Map.Entry<String,List<String>> str:hm.entrySet())
          {
              result.add(str.getValue());
          }
        
       
         return result;
    }
}