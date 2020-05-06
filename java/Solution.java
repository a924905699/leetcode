class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int len=days.length;
        int end=days[len-1];
        int start=days[0];
        int[] dp=new int[end+31];
       for (int temp=end,i=len-1;temp>=start;temp--){
           if(temp==days[i]){
               dp[temp]=Math.min(dp[temp+1]+costs[0],dp[temp+7]+costs[1]);
               dp[temp]=Math.min(dp[temp],dp[temp+30]+costs[2]);
               i--;
           }else {
               dp[temp]=dp[temp+1];
           }
       }
       return dp[start];
    }
}