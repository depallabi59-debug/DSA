class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]sol=new int[2];
        int j=0;
        int k=0;
        while(k==0){
        for(int i=1;i<nums.length;i++){
            int y=target-nums[j];
                if(nums[i]==y && i!=j){
                    sol[0]=j;
                    sol[1]=i;
                    k=1;


                }
                else if(i==nums.length-1){
                    j++;
                }
            }
            
        }
        return sol;
    
    }
    
}