import java.util.Scanner;
public class weekdays {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the nmber of day:");
        int day = sc.nextInt();

        if (day == 6 || day == 1) {
            System.err.println("The day is the weekend day");
        }
        else {
            System.out.println("The day is not a weekend day ");
        }

        
    }
}
