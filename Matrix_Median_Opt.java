public class Matrix_Median_Opt {

    // Calculate UpperBound to find elements (<= target)
    public static int upperBound(int mat[], int n, int target) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            // might be answer
            if (mat[mid] > target) {
                ans = mid;
                // look for a smaller index on the left
                high = mid - 1;
            } else {
                // look for greater on the right index
                low = mid + 1;
            }
        }
        return ans;
    }
    // TC  : O(log(109)) X O(M(logN)) //. SC  :  O(1)

    // Create function which is used to count lesser and equal elements to target (count <= target)
    public static int countSmallEqual(int mat[][], int n, int m, int target) {
        int cnt = 0; // to count elements lesser than or equal to target
        for (int i = 0; i < n; i++) {
            cnt += upperBound(mat[i], m, target);
        }
        return cnt;
    }

    // Create function to find median
    public static int median(int mat[][], int n, int m) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Point low and high to correct elements
        for (int i = 0; i < n; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m - 1]);
        }

        int req = (n * m) / 2;

        // Use binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            int smallEqual = countSmallEqual(mat, n, m, mid);
            if (smallEqual <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String args[]) {
        int mat[][] = { 
            {1, 2, 3, 4, 5},
            {8, 9, 11, 12, 13},
            {21, 23, 25, 27, 29}
        };
        int n = mat.length;
        int m = mat[0].length;
        int ans = median(mat, n, m);
        System.out.println("The median is: " + ans);
    }
}
