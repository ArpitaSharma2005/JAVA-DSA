import java.util.*;

public class OrderAgnosticBS{
    public static void main(String[] args){
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 7, 8, 41, 48, 51, 59};
        int[] arr = {99, 87, 76, 65, 54, 43, 32, 21, 10, 0, -5, -19, -30};

        int target = 54;
        int ans = orderAgnossticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnossticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending or desscending
        boolean isAsc = arr[start] < arr[end];

         while(start <= end){
                //find the middle element
                // int mid = (start + end)/2; // might be possible that (start+end) exid the range of int in java
                int mid = start + (end - start)/2;

                if(arr[mid]== target){
                    return mid;
                }

                if(isAsc){
                    if(target < arr[mid]){
                    end = mid -1;
                    }
                    else{
                    start = mid + 1;
                    }
                }
                else{
                    if(target > arr[mid]){
                    end = mid -1;
                    }
                    else{
                    start = mid + 1;
                    }
                }
            }
            return -1;

    }
}