class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<result.length();i++)
        {
            st.push(result.charAt(i));
        }
        while(!st.isEmpty())
            sb.append(st.pop());
        String a=sb.toString();
        if(result.equals(a))
        return true;
        else 
        return false;
    }
}