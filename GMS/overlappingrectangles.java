//https://practice.geeksforgeeks.org/problems/overlapping-rectangles1924/1/
//https://leetcode.com/problems/circle-and-rectangle-overlapping/
class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        // code here
        
        if(R2[1]>L1[1] || R2[0]<L1[0] || L2[1]<R1[1] || L2[0]>R1[0])
        return 0;
        else
        return 1;
        
        
    }
};
