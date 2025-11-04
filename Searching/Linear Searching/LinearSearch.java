public class LinearSearch{
    public static void main(String[] args){
        int[] nums = {41, 59, 7, 11, 4, 8};
        int target = 48;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    
    // search the target and return true and false

        static int linearSearch(int[] arr, int target){
        if(arr.length == 0)
        {
            return false;
        }
        for(int ele : arr){
            if(ele == target){
                return true;
            }
        }

        return false;
        
    }
   

}

// 1.check and return the index 
// search in the array: return the index if item found 
// otherwise if item not found return -1

//  static int linearSearch(int[] arr, int target){
//         if(arr.length == 0)
//         {
//             return -1;
//         }
//         for(int i=0; i<arr.length; i++){
//             int ele = arr[i];
//             if(ele == target){
//                 return i;
//             }
//         }

//         return -1;
        
//     }

// 2. search the target and return the element

    //  static int linearSearch(int[] arr, int target){
    //     if(arr.length == 0)
    //     {
    //         return -1;
    //     }
    //     for(int ele : arr){
    //         if(ele == target){
    //             return ele;
    //         }
    //     }

    //     return -1;
        
    // }