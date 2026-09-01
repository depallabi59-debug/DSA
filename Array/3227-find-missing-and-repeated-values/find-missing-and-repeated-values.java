class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long sum=0,sqsum=0;
        long n=grid.length;
        long total=n*n;
        int[] ans=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){

                  sum+=grid[i][j];
                  sqsum+= (long) grid[i][j]*grid[i][j];    
            
                
            }
        }
        long sumdiff=sum-(total*(total+1))/2;
        long sqrdiff=sqsum-(total*(total+1)*(2*total+1))/6;

        int repeat=(int) (sqrdiff / sumdiff + sumdiff)/2;
        int missing=(int) (sqrdiff / sumdiff - sumdiff)/2;

        ans[0]=repeat;
        ans[1]=missing;
    
    return ans;
        
    }
}