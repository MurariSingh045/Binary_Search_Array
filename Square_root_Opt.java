public class Square_root_Opt {
    public static int squareRoot(int n ){

        // edge case if the n = 0 then return 0
        if(n == 0) return 0;

        long low = 1, high = n;
        int ans = 0; // to store the possible ans
        while(low <= high){
            long mid = low + (high-low)/2; // to avoid overflow
            long value =  (mid*mid); // to store square of number
            // check conditions 
            if(value <= n){
                // might be my ans 
                ans = (int) mid;
                low = mid+1; // look on the right for maximum possible ans  
            }
            else high = mid-1;// eleminate right half and look for lower element
        }
        return ans ;

        // TC : O(n)  // SC : O(1)
    }
    public static  void main(String args[]){
        int n =  28;
        int ans =  squareRoot(n);
        System.out.println("The square root is : "+ans);
    }
}