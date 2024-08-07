class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int cnt=0;
        int n1=goal.length();
        if(n!=n1)
            return false;
        String ans=s + s;
        if(ans.contains(goal))
            return true;
        else
            return false;
    }
}
