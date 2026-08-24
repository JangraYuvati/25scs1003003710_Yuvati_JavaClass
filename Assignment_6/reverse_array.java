package Assignment_6;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,2,6,9,5,4,2};
        int n = arr.length;
        int i = 0, j = n-1;
        while(i<j){
            int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
        }
        System.out.println(Arrays.toString(arr));
       


               
                

            }

        }
    

