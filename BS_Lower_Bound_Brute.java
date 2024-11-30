public class BS_Lower_Bound_Brute {

    public static int lowerBound(int arr[], int target){

        int n = arr.length; // size of array
        int ans = n; // if  answer is not found hypothetically n is our index

        for(int i = 0; i<n; i++){

            if(arr[i] >= target ){
                // lower bound found
            // Type. 1    // return i
            // type2
                ans = i; 
                break;
            }
        }
        // return n
        return ans;  // TC : O(N) // SC : O(1)
    }

    public static void main(String args[]){
        int arr[] = {3, 5,8, 14, 19, 19, 19 };
        int target = 7;
        System.out.println("The  lower bound is :" +lowerBound(arr, target));
    }
}