public class BS_Upper_Bound_Opt {

    public  static int upperBound(int arr[] , int  target){

        int n = arr.length; // size of array
        int low = 0, high = n-1;
        int ans = n; //if  answer is not found hypothetically n is our index

        while(low <= high){

            // calculate mid
            int mid = (low+high)/2;

            if(arr[mid] > target){

                //  maybe this is our ans
                ans = mid;
                high = mid-1;  //look for smaller index on the left
            }
            else low = mid+1; // looking on the left
        }
        return ans;
    }
    public static void main(String  args[]){
        int arr[] = {3, 5, 7,8, 15, 19, 19};
        int target  = 7;
        System.out.println("The upper Bound is :" +upperBound(arr, target));
    }
    
}
