class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,idx=0;
        int[] sol=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                sol[idx]=nums2[j];
                j++;
            }
            else{
                sol[idx]=nums1[i];
                i++;
            }
            idx++;
        }
    while(j<n){
        sol[idx]=nums2[j];
        j++;
        idx++;
    }

    while(i<m){
        sol[idx]=nums1[i];
        i++;
        idx++;

    }
    for(int k=0;k<sol.length;k++){
        nums1[k]=sol[k];

    }
    }
}

      

        