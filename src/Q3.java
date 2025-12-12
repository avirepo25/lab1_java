import java.util.Scanner;
import java.time.LocalDate;

public class Q3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Get current month and year
            LocalDate today = LocalDate.now();
            int year = today.getYear();
            int month = today.getMonthValue();

            // Input: day number of current month
            System.out.print("Enter day number of current month: ");
            int day = sc.nextInt();

            // Validate day
            if (day < 1 || day > today.lengthOfMonth()) {
                System.out.println("Invalid day number for this month!");
                return;
            }

            // Construct date
            LocalDate date = LocalDate.of(year, month, day);

            // Get day of week (1 = Monday, 7 = Sunday)
            int dayOfWeek = date.getDayOfWeek().getValue();

            // Print weekday using switch-case
            switch (dayOfWeek) {
                case 1:
                    System.out.println("Weekday: Monday");
                    break;
                case 2:
                    System.out.println("Weekday: Tuesday");
                    break;
                case 3:
                    System.out.println("Weekday: Wednesday");
                    break;
                case 4:
                    System.out.println("Weekday: Thursday");
                    break;
                case 5:
                    System.out.println("Weekday: Friday");
                    break;
                case 6:
                    System.out.println("Weekday: Saturday");
                    break;
                case 7:
                    System.out.println("Weekday: Sunday");
                    break;
                default:
                    System.out.println("Error in calculating weekday!");
            }

            sc.close();
        }
    }

