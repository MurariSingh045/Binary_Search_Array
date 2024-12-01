public class First_and_Last_Occurence_Opt {
     // find firts occurence
     public static int firstOccurence(int nums[] , int target ){
        int n = nums.length; // size of array
        int first = -1;
        int low = 0, high = n-1;
        while(low <= high ){
            int mid = (low+high)/2;
            // maybe an answer
            if(nums[mid] == target){
                first = mid;
                 // look for smaller index on the left
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid+1;// look on the right
            }
            else high = mid-1; // look on the left
        }
        return first;
    }
     // find last occurence
    public static int lastOccurence(int nums[] , int target ){
        int n = nums.length; // size of nums
    
        int last = -1;
        int low = 0, high = n-1;
        while(low <= high ){
            int mid = (low+high)/2;
              // maybe an answer
            if(nums[mid] == target){
                last = mid;
                // look for larger index on the right
                low = mid+1;
            }
            else if(nums [mid] < target){
                low = mid+1;// look on the right
            }
            else high = mid-1;// look on the left
        }
        return last;
    }
    public static int[] countOccurence(int[] nums, int target) {

       int first = firstOccurence(nums , target);
       if(first == -1) return new int[] {-1, -1};
       int last = lastOccurence(nums, target);
       return new int[] {first , last};
        
    }
    public static void main(String args[]){
        int nums[] = {2, 4, 6, 8 , 8, 8, 11, 13};
        int target = 8;
        int ans[] = countOccurence(nums, target);
        System.out.println("The first and last occurence are : " +ans[0]+ " ," + ans[1]); 
    }
    
}
