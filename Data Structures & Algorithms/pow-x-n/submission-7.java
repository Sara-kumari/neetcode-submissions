class Solution {
    public double myPow(double x, long n) {
        double ans=0;
        if(n==0) return 1;
        if(n==1) return x;
        
        if(n<0){return 1/myPow(x,-n);
        }
        double half = myPow(x, n/2);
    //    ans= myPow(x,n-1);
      if(n % 2 == 0)
    return half * half;
else
    return half * half * x;
       

    }
}
