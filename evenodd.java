import java.util.Scanner;

public class evenodd {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        for (int a = 1; a <= 100; a++) {

            System.out.println("Enter the number:");
            String input = sc.nextLine();

            try {
                int n = Integer.parseInt(input);

                if (n % 2 == 0) {
                    System.out.println(a + ") " + n + " = even");
                } else {
                    System.out.println(a + ") " + n + " = odd");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                a--; // don't count invalid input
            }
        }

        sc.close();
    }
}