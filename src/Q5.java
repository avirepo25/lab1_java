import java.util.Scanner;

public class Q5  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first name
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        // Input last name
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        // Output: last name followed by first name
        System.out.println("Formatted Name: " + lastName + " " + firstName);

        sc.close();
    }
}
