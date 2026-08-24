//max element

package Assignment_6;

public class largest_element {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,4,1,9,7,5,3,98,32,56};
        int n = arr.length;
       int max = arr[0];
        for(int i =1; i<n; i++){
         
           if(max<arr[i]){
            
             max = arr[i];
           }
       // else max = arr[i-1];
        }
        System.out.println(max);
        
    }
}
