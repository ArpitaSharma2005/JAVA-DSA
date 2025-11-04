import java.util.*;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 59, 41, 789, 4159};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(345678));
    }

    static int findNumbers(int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            if (even(num)) {
                cnt++;
            }
        }
        return cnt;
    }

    // function to check whether a number contains even number of digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int cnt = 0;
        while (num > 0) {
            cnt++;
            num = num / 10;
        }
        return cnt;
    }

    static int digits2(int num){
        return (int)(Math.log10(num)) + 1;
    }
}
