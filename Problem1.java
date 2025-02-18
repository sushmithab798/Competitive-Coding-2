//Problem 1:Two Sum

//Time Complexity : O(N)
//Space Complexity : O(N)
  
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[] {i, map.get(target - nums[i])};
            }else{
                map.put(nums[i], i);
            } 
        }
        return new int[0];
        
        
    }
}