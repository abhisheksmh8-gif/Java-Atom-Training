import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a power of 2.");
        } else {
            while (n % 2 == 0) {
                n /= 2;
            }

            if (n == 1) {
                System.out.println("Power of 2.");
            } else {
                System.out.println("Not a power of 2.");
            }
        }

        sc.close();
    }
}