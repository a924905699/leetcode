class Solution {
    public int maxProduct(int[] nums) {
        int MAX=nums[0];
        int MIN=nums[0];
        int ans=0;
        for (int i=1;i<nums.length;i++){
            int MX=MAX;
            int MN=MIN;
            MAX=Math.max(MX*nums[i],Math.max(nums[i],MN*nums[i]));
            MIN=Math.min(MX*nums[i],Math.min(nums[i],MN*nums[i]));
            ans=Math.max(MAX,ans);
        }
        return ans;
    }
}