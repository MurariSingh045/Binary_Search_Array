public class Search_in_2DMat_Better {
    // use binary Search
    // we are assuming every row of mat as an sorted Array
    public static boolean binarySearch(int mat[] , int target){
        int n = mat.length; // size of the array 
        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low+high)/2;

            // if the target found return true
            if(mat[mid] == target) return true;

            // if the target is greter look on the right coz array is sorted
            // it would never be on the left
            else if(mat[mid] < target) low = mid+1;
            // look on the  left  if target smaller
            else high =  mid-1;
        }
        return false ; // if target is not found
    }

    public static boolean searchMatrix(int mat[][] , int target){

        int n = mat.length; // size of the row
        int m = mat[0].length; // size of the column

        for(int i = 0; i<n; i++){
            
            // if the target is in between mat[i][0] & mat[i][m-1]
            // then call binary search 
            // because we are assuming every row as a 1D sorted array
            // we can easily use binary search on sorted 1D array
            if(mat[i][0] <= target && target <= mat[i][m-1]){
               
                // always our operation would terminate here while(low <= high)
                return binarySearch(mat[i], target); // if we found target return true
            }
        }
        return false; // if not found

        // TC :  O(N + logM) // SC : O(1)
    }
    public static void main(String args[]){
        int mat[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        int target = 8;
        boolean ans = searchMatrix(mat, target);
        System.out.println(ans? "true" : "false");
    }
    
}
