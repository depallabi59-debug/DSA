class Solution {
    public int[] twoSum(int[] nums, int target) {
       int lp=0;
       int hp=nums.length-1;
       int[] sol=new int[2];
       while(lp<=hp){
          if(nums[lp]+nums[hp]==target ){
            sol[0]=lp;
            sol[1]=hp;
             break;
          }
          hp--;
          if(hp==lp){
            hp=nums.length-1;
            lp++;

          }
       }
       return sol;
    }


    
}