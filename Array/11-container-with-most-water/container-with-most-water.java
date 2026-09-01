class Solution {
    public int maxArea(int[] height) {
        int lp=0; //lower pointer
        int n=height.length;
        int up=n-1; //upper pointer
         int maxarea=0;
          while(lp<up){
           int ht=Math.min(height[lp],height[up]);
           int width=up-lp;
           int area=ht*width;
           maxarea=Math.max(area,maxarea);
           if(height[lp]<height[up]){
            lp++;
           }
           else{
            up--;
           }
          }
          return maxarea;

            }

    }
