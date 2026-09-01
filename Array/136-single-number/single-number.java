class Solution {
    public int singleNumber(int[] nums) {
        int k=0;
        int xor=0;
        for(int i=0;i<nums.length;i++){
             xor^=nums[i];
             
            }
        return xor;
        }
        
    }