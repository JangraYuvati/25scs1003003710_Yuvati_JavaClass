package Assignment_5;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("2 is a prime number ");
        }
        for(int i = 3; i<=n/2 ; i++){
           if(n%i != 0 ){
            System.out.println(n +" is a prime number ");
            break;
           }
           else{
            System.out.println(n +" is a not prime number ");
            break;
           }
        }
    }
    
}
