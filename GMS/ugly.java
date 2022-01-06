//https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/#
class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        long[] ugly = new long[n];
        ugly[0]=1;
        int i2=0,i3=0,i5=0;long next=1;
        long nexti2=ugly[i2]*2;
        long nexti3=ugly[i3]*3;
        long nexti5=ugly[i5]*5;
        
        
        for(int i=1;i<n;i++)
        {
            
            next=Math.min(nexti2,Math.min(nexti5,nexti3));
            ugly[i]=next;
            if(next==nexti2)
            ++i2;nexti2=ugly[i2]*2;
            if(next==nexti3)
            ++i3;nexti3=ugly[i3]*3;
            if(next==nexti5)
            ++i5;nexti5=ugly[i5]*5;
        }
          return next;
    }
}

/**

This solution gave RUNTIME Error

class Solution {
    Function to get the nth ugly number
    long getNthUglyNo(int n) {
         
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
**/
