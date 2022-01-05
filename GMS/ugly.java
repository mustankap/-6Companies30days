//This solution gave RUNTIME Error
class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        long no=0;
        long i =1;
        int count=1;
        while(n>count)
        {
            i++;
            no=primefactor(i,2);
            no=primefactor(no,3);
            no=primefactor(no,5);
            if(no==1)
                count++;
        }
        return i;
        
    }
    
    long primefactor(long a,long b)
    {
        while(a%b==0)
        {
            a/=b;
        }
          return a;
    }
}
