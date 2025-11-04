public class max{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,56,59,41};
        System.out.println(maxRange(arr, 1, 3));
    }
    static int max(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }
        
        if(arr == null){
            return -1;
        }

        int maxVal = arr[start];
        for(int i = start; i<=end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}