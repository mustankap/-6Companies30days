//https://practice.geeksforgeeks.org/problems/run-length-encoding/1/#
class gfg
{
String encode(String str)
	{
          //Your code here
          String s ="";
          int c = 1;
         
        for(int i =1;i<str.length();i++)
        {   
            if(str.charAt(i)!=str.charAt(i-1))
              {
                s+=str.charAt(i-1);
                s+=c;
                c=1;
              }
              else{
                  c++;
              }
              
          }
          s+=str.charAt(str.length()-1);
        s+=c;
          return(s);
  }       
}
