import java.util.Arrays;

public class SearchIn2DArray{
    public static void main(String[] args){
        int[][] arr = {
            {41,59,11},
            {11,4,1,5,9},
            {8,7,50,48},
            {59,11}
        };
        int target = 59;
        int[] ans = search(arr, target); // format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}