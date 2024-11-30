public class Search_Rotated_SortedArray_LS {

    public static int getElement(int arr[] , int target){
        int n = arr.length;
        for(int i = 0; i<n; i++){

            // search in aary
            if(arr[i] == target){
                return i;
            }
        }
        return -1;  // TC : O(N) // SC : O(1)
    }
    public static void main(String args[]){
        int arr[] = {7, 8, 9, 1, 2, 3, 4, 5 , 6};
        int target = 1;
        int ans = getElement(arr, target);
        if(ans == -1){
            System.out.println("Target is not found");
        }
        else{
            System.out.println("Target is found : " +ans);
        }
    }
    
}
