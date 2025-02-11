public class BS_Minimum_in_RS_Array_Opt {

    public static int minimumElement(int arr[] ){
        int n = arr.length;
        int low = 0 , high = n-1;
        int ans = Integer.MAX_VALUE; // store the minimum element
        while(low <= high){
            // calculate mid
            int mid = (low+high)/2;

            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if(arr[low] <= arr[high]){
                ans = Math.min(ans , arr[low]);
                break;  // we do not need to perform the binary search 
            }
            // if left half is sorted  we take low as minimum and trim the left half
            // 
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans , arr[low]);
                low = mid +1;
            }
            // if the left half is not sorted our right half always be sorted that time take mid as low 
           // and trim the right half
            else{
                ans = Math.min(ans , arr[mid]);
                high = mid-1;
            }
        }
        return ans ;  // TC : O(logN) // SC : O(1)
    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println("The  minimum element is :" +minimumElement(arr));

    }
    
}
