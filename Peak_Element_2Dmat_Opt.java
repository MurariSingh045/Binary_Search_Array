public class Peak_Element_2Dmat_Opt {

    //  find maxvalue of  the column
    public static int findMax(int mat[][] , int  n , int m , int col){
        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        for(int i =  0;  i<n; i++){
            if(mat[i][col] > maxValue){
                maxValue =  mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public  static int[] findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int low =  0 , high = m-1; // Initialize search range for columns
        int ans[] =  new int[2]; // Array to store the result (row index, column index)

        // Binary search to find the peak column-wise
        while(low <= high){
            int mid = (low + high)/2;// Calculate mid-column index
            
            // Find the row index of the maximum value in mid-column
            int maxRowindex = findMax(mat , n , m , mid);

            // Values of neighbors (left and right) of the mid-column element in the row
            int left = mid-1>=0 ? mat[maxRowindex][mid-1] : Integer.MIN_VALUE;// Left neighbor or -∞
            int right = mid+1 < m ? mat[maxRowindex][mid+1] : Integer.MIN_VALUE;// Right neighbor or -∞
            
            // Check if the mid-column element is a peak
            if(mat[maxRowindex][mid] > left && mat[maxRowindex][mid] > right){
                ans[0] =  maxRowindex; //  row of the peak
                ans[1]  = mid; /// column of the peak
                return ans;
            }
            // If the left neighbor is greater, move to the left half
            else if (mat[maxRowindex][mid]  < left){
                high = mid-1;
            }
            // If the right neighbor is greater, move to the right half
            else low =  mid+1;
        }
        return ans;

        // TC :  O(n*logM)  // SC : O(1)
    }
    public static void main(String args[]){
        int  mat[][]  = {{10,20,15}, {21,30,14}, {7,16,32}};
        int ans[] = findPeakGrid(mat);
        System.out.println("The peak element index :" +ans[0]+ "," +ans[1]);
    }
    
}
