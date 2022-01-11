https://leetcode.com/problems/minimum-size-subarray-sum/submissions/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int sum = 0, mn = Integer.MAX_VALUE;
        int i = 0;
        
        for(int j=0 ; j<nums.length; j++){
            sum += nums[j];
            
            if(sum >= target){
                while(sum >= target){
                    mn = Math.min(mn, j-i+1);
                    sum-=nums[i++];
                }
            }
        }
        return (mn == Integer.MAX_VALUE ? 0 : mn);
    }
}
