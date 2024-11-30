public class Peak_Element_BS {

    public static int findPeakelement(int arr[]){
        int n = arr.length;
        
        // manually write code for below edge cases
        // 1. if array have only one element that element would be my peak 
        if(n == 1) return 0;
        // 2. if array would be in decreasing order    
        //    first element(arr[0]) would be my peak 
        // because left hand side of array we always compare with (- infinity)
        if(arr[0]> arr[1]) return 0;
        // 2. if array would be in increasing order    
        //    last element(arr[n-1]) would be my peak 
        // because right hand side of array we always compare with (- infinity)
        if(arr[n-1] > arr[n-2]) return n-1;
 
        // we are shrinking our search space
        // coz we write code manually
        int low = 1 , high = n-2;
        while(low <= high){
            int mid = (low+high)/2;
            // If arr[mid] is the peak:
            if(arr[mid] > arr[mid-1]&& arr[mid] > arr[mid+1]){
                return mid;  // return mid which is the peak index
                             // and all the cases always terminated here
            }
            // if this condition stisfy our peak element would be on the right
            else if(arr[mid] > arr[mid-1]){
                low = mid+1;
            }
            
          // if this condition statisfy our peak element would be on the left
            else if(arr[mid] > arr[mid+1]){
                high = mid-1;
            }
            
            // If we are in the right:
            // Or, arr[mid] is a common point:
            else high = mid-1;
        }
        return -1;  // TC : O(logN)  // SC : O(1)
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,5,1};
        System.out.println("the peak index is : " +findPeakelement(arr));
    }
    
}
