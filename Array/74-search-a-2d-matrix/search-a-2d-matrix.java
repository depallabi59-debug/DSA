class Solution { 
    public boolean searchrow(int[][]matrix,int target,int midr,int n){
        int s=0;
        int e=n-1;
            while(s<=e){
               int midc=(s+e)/2;
                if(target==matrix[midr][midc]){
                    return true;
                }
                else if(target>matrix[midr][midc]){
                    s=midc+1;
                }
                else{
                    e=midc-1;
                }
            }
            return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
    int m=matrix.length;
    int n=matrix[0].length;
    int si=0;
    int ei=m-1;
    while(si<=ei){
       int midr=(si+ei)/2;
        if(matrix[midr][0]<=target && target<=matrix[midr][n-1]){
            return searchrow(matrix,target,midr,n);     
                }
            
        else if(target>=matrix[midr][n-1]){
            si=midr+1;
        }
        else{
            ei=midr-1;
        }
    }
    return false;


    }
    
        
}