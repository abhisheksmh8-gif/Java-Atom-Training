import java.util.*;

public class FirstLetterTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println("First letter to appear twice: " + ch);
                return;
            }

            set.add(ch);
        }

        System.out.println("No letter appears twice.");

        sc.close();
    }
}