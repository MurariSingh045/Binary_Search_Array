public class BS_Lower_Bound_Opt {

    public static int lowerBound(int arr[] , int target){

        int n = arr.length;
        int low = 0 , high = n-1;
        int ans = n; // if  answer is not found hypothetically n is our index

        while(low <= high){

            //  calculate  mid
            int mid = (low+high)/2;

            if(arr[mid] >= target){

                // maybe this is our ans
                ans = mid;
                high = mid-1; // looking on left for smallest one
            }
            else low = mid+1; // looking on the right fo smallest
        }
        return ans;  // TC ; O(logN) // SC : O(1)

    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 7,8, 15, 19, 19};
        int target = 7;
        System.out.println(" The lower bound is :" +lowerBound(arr, target));
    }
    
}
