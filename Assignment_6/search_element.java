package Assignment_6;

public class search_element {
    public static void main(String[] args) {
        int[] arr = {2,56,78,43,56,23,98,987,1,45,3};
        int ele = 3;
        for(int i=0; i < arr.length;i++){
            if(arr[i] == ele){
                System.out.println("Target element found at index: " + i);

                
            }
         //   else System.out.println("Target element found");
        }

    }
}
