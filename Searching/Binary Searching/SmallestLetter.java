import java.util.*;

public class SmallestLetter{
    public static void main(String[] args){

        int[] arr = {"c","f","j"};
        int target = 15;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }
    // return the index
        // return smallest number in array >= target
        static int Ceiling(int[] arr, int target){

            // but what if the target is greater than the greatest numbet in the array
            if(target > arr[arr.length-1]){
                return -1;
            }

            int start = 0;
            int end = arr.length-1;

            while(start <= end){
                //find the middle element
                // int mid = (start + end)/2; // might be possible that (start+end) exid the range of int in java
                int mid = start + (end - start)/2;

                if(target < arr[mid]){
                    end = mid -1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
            return arr[start];

        } 
}