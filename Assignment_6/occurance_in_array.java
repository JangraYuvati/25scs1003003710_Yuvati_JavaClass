package Assignment_6;

public class occurance_in_array {
    public static void main(String[] args) {
        int[] arr = {1,1,5,1,7,1,8,7,8,9};
        int target = 1;
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                count+=1;
            }
        }
        System.out.println("occurance of target element 1:" + count);
    }
    
}
