//https://leetcode.com/problems/group-anagrams/
//https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        List<List<String>> ans = new ArrayList<>();
       
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i =0;i<strs.length;i++)
        {
            char []arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String strs1 = Arrays.toString(arr);
            
            if (hm.containsKey(strs1)) {
 
              hm.get(strs1).add(strs[i]);
            }
            else {
 
                List<String> word = new ArrayList<>();
                word.add(strs[i]);
                hm.put(strs1,word);
            }
            
        }
        
         ans.addAll(hm.values());
        
        return ans;
        
        
    }
}
