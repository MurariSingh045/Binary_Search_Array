public class BS_Minimum_in_RS_Arraybrute {

    public static int getMinimum(int arr[]){
        int n = arr.length;
        int minimumElement = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){

            minimumElement = Math.min(minimumElement , arr[i]);
        }
        return minimumElement;  // TC : O(N)  // SC : O(1)
    }
    public static void main(String args[]){
        int arr[] = {4 , 5, 6, 7, 0, 1, 2};
        System.out.println(" The minimu element is :" +getMinimum(arr));
    }
    
}
