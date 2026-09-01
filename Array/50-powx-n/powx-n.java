class Solution {
    public double myPow(double x, int n) {
       
        if(n==0){
            return 1.0;
        }
        if(n<0){
            double half=myPow(1/x,-n/2);
            double power=half*half;
             if(n%2!=0){
               power=1/x*half*half;
               return power;
             }

        }
        
         double half=myPow(x,n/2);
         double power=half*half;
             if(n%2!=0){
                power=x*half*half;
             }
        return power;

        }
        
        

}