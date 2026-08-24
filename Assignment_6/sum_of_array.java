package Assignment_6;

import java.util.Arrays;

public class sum_of_array {
    public static void main(String[] args) {
        int[] arr = {1,4,5,8,9,5,3};
        int sum = 0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            sum+= arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of the above array is: " + sum);
    }}

