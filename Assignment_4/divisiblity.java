public class divisiblity {
    public static void main(String[] args) {
        int n = 10;
        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5.");
            if (n%10 == 0){
                System.out.println(n + " is also divisible by 10.");
            }
            else {
                System.out.println(n + " is not divisible by 10.");
            }
        } else {
            System.out.println(n + " is not divisible by 5.");
        }
    }
}
