public class Search_Rotated_SortedArray_2_opt {

    public static boolean getElement(int arr[] , int target){

        int n  = arr.length;
        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low+high)/2;

            // if the element found return true
            if(arr[mid] == target) return true;

            // Edge case 
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                // shrink our search space
                low = low +1;
                high = high-1;
                continue;
            }
            // if the left part is sorted:
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    // element exist
                    high = mid-1;
                }
                // element does not exist
                else low = mid+1 ;
            }
            // if the right part is sorted:
            else{
                if(arr[mid] <=  target && target <= arr[high]){
                    low = mid+1;
                }
                else high = mid-1;
            }

        }
        // if element does not exist in this array
        return false;  // TC :  O(logN) // SC :O(1)
    }
    public static void main(String args[]){

        int arr[] = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;
        boolean ans = getElement(arr, target);
        if(ans == false){
            System.out.println("The element is not present ");
        }
        else{
            System.out.println("The element is present in this array");
        }

    }
    
}
