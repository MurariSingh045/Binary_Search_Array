public class Search_Rotated_SortedArray_2_LS {

    public static boolean getElement(int arr[] , int target){

        int n = arr.length;
        for(int  i = 0; i<n; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;  // TC :  O(N) // SC :O(1)
    }
    public static void mian(String args[]){
        int arr[] = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;
        boolean ans = getElement(arr, target);
        if(ans == true){
            System.out.println(" The element is not present ");
        }
        else{
            System.out.println("The element is present in  the array");
        }
    }
    
}
