public class Search_Rotated_SortedArray_BS {

    public static int getElement(int arr[] , int target){

        int n = arr.length; // size of Array
        
        // intialize low and high
        int low = 0 , high = n-1;

        while(low <= high){

            // calculate mid
            int mid = (low+high)/2;
            
            // if element found in first search then return their index
            if(arr[mid] == target) return mid;

            
            // if left part is sorted
            if(arr[low] <= arr[mid]){

                if(arr[low] <= target && target <= arr[mid]){

                    // element exist
                    high = mid-1;
                }
                // element does not exist

                else low = mid +1;
            }
            // if right part is sorted
            else{
                if(arr[mid] <= target && target <= arr[high]){
                    // element exist
                    low = mid+1;
                }
                // element does not exist
                else{
                    high = mid-1;
                }
            }
        }
        return -1;  // TC : O(logN)  // SC : O(1)
    }

    public static void main(String args[]){
        int arr[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int target = 1;
        int ans = getElement(arr, target);

        if(ans == -1) {
            System.out.println("Target is not found");
        }
        else{
            System.out.println("Target is found : " + ans);
        }
    }
    
}
