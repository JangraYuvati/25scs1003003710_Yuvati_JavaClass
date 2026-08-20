package Assignment_5;
import java.util.Scanner;
public class divisble_by_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        for(int i =3; i<=n; i++){
            if(i%3 ==0){
                System.out.println(i + " " + "is divisible by 3");

            }
        }
    

    }
    
}
