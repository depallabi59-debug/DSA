class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
              if(i>0 && nums[i]==nums[i-1]){
                 continue;
              }    
            
           for(int j=i+1;j<nums.length-2;j++){
            if( j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
            int k=j+1;
            int l=nums.length-1;
            while(k<l){
                long s=(long) nums[i]+nums[j]+nums[k]+nums[l];
                if(s>target){
                    l--;
                }
                else if(s<target){
                    k++;
                }
                else{
                    List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                    ans.add(list);
                    k++;
                    l--;
                    while(k<l && nums[k]==nums[k-1]){
                        k++;
                    }
                    while(k<l && nums[l]==nums[l+1]){
                        l--;
                    }
                }
            }



           }
        }
        return ans;
        
    }
}