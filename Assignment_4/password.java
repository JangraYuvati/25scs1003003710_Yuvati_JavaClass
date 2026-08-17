import java.util.Scanner;
public class password {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = sc.nextLine();

        int length = password.length();
        if (length <8){
            System.out.println("pASSWORD IS OF LESS THAN 8 CHARACTERS ") ;
        }
        else if (length == 8) System.out.println("pASSWORD IS OF 8 CHARACTERS ") ;

        else System.out.println("pASSWORD IS Strong ") ;



    }
}
