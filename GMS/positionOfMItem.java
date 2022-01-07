class Solution {
    static int findPosition(int n , int m , int k) {
        // code here
        // if(n==m==k==1)
        // return 1;
        if(k+m-1 <= n)
        return k+m-1;
        
        m-=n-k+1;
            return (m % n == 0) ? n : (m % n);
    }
