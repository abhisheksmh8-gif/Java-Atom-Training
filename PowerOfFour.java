import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            while (n % 4 == 0) {
                n = n / 4;
            }
        }

        if (n == 1) {
            System.out.println("Power of 4");
        } else {
            System.out.println("Not a power of 4");
        }

        sc.close();
    }
}