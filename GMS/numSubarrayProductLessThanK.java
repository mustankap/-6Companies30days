//https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/


class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {long prod = 1;int ans=0, l=0;
        
        for(int i =0;i<a.length;i++)
        {
            prod*=a[i];
            while(prod>=k && l<=i)
            {
                prod/=a[l];
                l++;
            }
            ans+=i-l+1;
        }
        
        return ans;
    }
}



//https://leetcode.com/problems/subarray-product-less-than-k/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ans = 0, product = 1;
        int l=0;
        for (int r = 0; r<n; r++) {
            
            product*=nums[r];
            while (product>=k && l<=r) {
                product/=nums[l];
                l++;
            }
            ans+=(r-l+1);
        }
        return ans;
    }
}
