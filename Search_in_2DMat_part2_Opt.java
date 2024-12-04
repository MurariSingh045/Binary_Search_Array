public class Search_in_2DMat_part2_Opt {

       // we first check the pattern of matrix how  it's  elemenents arranged here every row and column is sorted 
       // row is sorted in  horizonral direction & col is sorted in vertical
       //  we can either star  our itertion from right top corner or  left bottom  corner.
    public static boolean searchMatrix(int mat[][] , int target){

        int n = mat.length; // size  of  row
        int m =  mat[0].length; // size of column
        int row = 0 , col  = m-1;
        while(row < n &&  col  >= 0){
            // if we found our target return true
            if(mat[row][col] == target) return true;
            else if(mat[row][col] < target) row++; // if our target is lower we move our row one step
            else col--; //  if our target is grater decrease col backward
        }
        return false; // if the target  not found return  false

        // TC :  O(N+M) // SC : O(1)
    }
    public static void main(String args[]){
        int mat[][] = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        int target = 14;
        boolean ans = searchMatrix(mat, target);
        System.out.println(ans ? "true" : "false");
    }
    
}
