import java.util.Scanner;

interface LineCheck {
    boolean isStraightLine(int[][] coordinates);
}

class CoordinateChecker implements LineCheck {

    public boolean isStraightLine(int[][] coordinates) {

        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coordinates: ");
        int n = sc.nextInt();

        int[][] coordinates = new int[n][2];

        System.out.println("Enter the coordinates (x y):");
        for (int i = 0; i < n; i++) {
            coordinates[i][0] = sc.nextInt();
            coordinates[i][1] = sc.nextInt();
        }

        CoordinateChecker checker = new CoordinateChecker();

        System.out.println(checker.isStraightLine(coordinates));

        sc.close();
    }
}
