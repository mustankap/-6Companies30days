class Solution{
  static int[] max_10_numbers(List<Integer> arr)
    {
         PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for(int i= 0;i<10;i++)
        { pQueue.push(i);
        }
        
        while(int i = 9;i<arr.size();i++)
           if(pQueue.peek()<arr.get(i))
           {
              pQueue.poll();
              pQueue.push(i);
           }
        }
        
       return pQueue.toArray();
    }
}
