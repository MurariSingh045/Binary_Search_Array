public class BS_Floor_and_Ceil {

    public static int[] getfloorAndCeil(int arr[] , int target){

        int n = arr.length; // size of array
        int low = 0 , high = n-1;
        int ceil = -1;  // if ceil not found return -1
        
        // calculate ceil value(lower bound) = [arr[mid] >= target]
        while(low <= high){

            // calculate mid 
            int mid = (low+high)/2;

            if(arr[mid] >= target){
                ceil = arr[mid];
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        // calculate floor [ arr[mid] <= target]
        int floor = -1;
        low = 0; high = n-1;
        while(low <= high){
            // calculate mid
            int mid = (low +high)/2;

            if(arr[mid] <= target){
                floor = arr[mid];
                low = mid+1;
            }
            else high = mid-1;
        }
        // create ans array of size 2 to store floor and ceil
        int ans[] = new int[2];
        ans[0] = floor;
        ans[1] = ceil;
        return ans; // TC : O() // SC 
    }

    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 50};
        int target = 25;
        int ans[] = getfloorAndCeil(arr, target);
        System.out.println("The floor and ceil are: " + ans[0]
        + " " + ans[1]);
    }
}