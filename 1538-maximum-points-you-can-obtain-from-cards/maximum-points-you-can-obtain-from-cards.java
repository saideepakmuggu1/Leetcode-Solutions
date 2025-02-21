class Solution
 {
    public int maxScore(int[] cardPoints, int k) 
    {
        int lsum = 0;
        int rsum = 0;
        int msum = 0;
        for(int i=0;i<k;i++)
           lsum = lsum + cardPoints[i];
        msum = lsum;
        int rindex = cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rindex];
            msum = Math.max( msum , lsum+rsum );
            rindex = rindex -1;
        }
        return msum;
    }
}