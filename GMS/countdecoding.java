//https://leetcode.com/problems/decode-ways/submissions/
//https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/
class Solution {
    public int numDecodings(String s) {
        int[] noofways = new int[s.length()+1];
        if(s.charAt(0)=='0')
            return 0;
        
        noofways[0]=1;
        noofways[1]=1;
        for(int i = 2;i<=s.length();i++)
        {
             noofways[i] = 0;
            if(s.charAt(i-1)>'0')
                noofways[i]=noofways[i-1];
            
            if(s.charAt(i-2)=='1' || s.charAt(i-2)=='2' && s.charAt(i-1)<'7')
                noofways[i]+=noofways[i-2];
            
        }
        
        return noofways[s.length()];
    }
}
