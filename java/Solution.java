class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int[] dp=new int[nums.length];
        dp[0]=1;
        int maxlen=1;
        for (int i=1;i<dp.length;i++){
            int val=0;
            for (int j=0;j<i;j++){
                if(nums[i]>nums[j]) val=Math.max(val,dp[j]);
            }
            dp[i]+=val+1;
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}