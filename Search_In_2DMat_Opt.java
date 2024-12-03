public class Search_In_2DMat_Opt {

    public static boolean searchMatrix(int mat[][] , int target){
        int n = mat.length; // size of row
        int m = mat[0].length; // size of column
        int low = 0; // first index of hypothetically assume  1D array
        int high = n*m-1;// last index of hypothetically assume  1D array

        while(low <= high){
            int mid = (low+high)/2;

            int row = mid/m; // convert 2D cordinates to 1D :(1,1) :-> 5
            int col = mid%m; // convert 2D cordinates to 1D : (1,1) :-> 5

            // if target found return true 
            if(mat[row][col] ==  target){
                return true;
            }
            // if target is greater than mat[row[col] then check on the right 
            // coz we can not find target on the left coz mat is sorted
            else if(mat[row][col] < target){
                low = mid+1;  // check on the right
            }
            // if target is smaller check on the left
            else high = mid-1;
        }
        // if the target not found return false
        return false;

        // TC : O(log(NxM)) // SC : O(1)
    
    }
    public static void main(String args[]){
        int mat[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        int target = 8;
        boolean ans = searchMatrix(mat, target);
        if(ans != true){
            System.out.println("Target is not present in the mat");
        }
        else{
            System.out.println("Target is present in the mat");
        }
    }
    
}
