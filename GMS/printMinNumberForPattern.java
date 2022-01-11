//https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1

class Solution{
    static String printMinNumberForPattern(String s){
        // code here
        
        Stack<Integer> ans= new Stack<>();
        String res="";
        for(int i=0;i<=s.length();i++)
        {
            ans.push(i+1);
            
            if(i==s.length() || s.charAt(i)=='I')
            {
                while(!ans.isEmpty())
                {res+=String.valueOf(ans.peek());
                ans.pop();}
            
            }
            
            
        }
        return res;
        
    }
}
