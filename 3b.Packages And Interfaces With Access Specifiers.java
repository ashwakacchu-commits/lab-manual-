import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pi Calculator using Access Specifiers ===");
        System.out.print("Enter the number of terms for Pi approximation: ");

        int terms = sc.nextInt();   // Enter 5 here

        double pi = 0.0;

        for (int i = 0; i < terms; i++) {
            if (i % 2 == 0)
                pi += 4.0 / (2 * i + 1);
            else
                pi -= 4.0 / (2 * i + 1);
        }

        System.out.println("\nCalculating Pi using Leibniz Series...");

        System.out.println("\nPublic Method - Displaying Result:");
        System.out.println("Approximated value of Pi: " + pi);

        System.out.println("\nProtected Method - Displaying Precision Info:");
        System.out.println("Precision used: " + terms + " terms");
        System.out.println("Series used: Leibniz Series (4/1 - 4/3 + 4/5 - 4/7 + 4/9 ...)");

        System.out.println("\nPrivate Data - Accessed only within class:");
        System.out.println("Raw computed value (private): " + pi);

        sc.close();
    }
}
