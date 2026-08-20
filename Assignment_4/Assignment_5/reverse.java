package Assignment_5;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int reversed = 0;

        while (number != 0) {
            
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reversed);
    




        
        


    }
}
