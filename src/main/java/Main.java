import java.util.Scanner;

class Main {

    public static void showMenu() {
        System.out.println();
        System.out.println("Operations on double/float :");
        System.out.println("1. Compare");
        System.out.println("2. Round up");
        System.out.println("3. Drop the fractional part");
        System.out.println();
    }

    public static boolean isEqual(float x, double y, double eps) {
        return Math.abs(x - y) < eps;
    }

    public static void getBiggest(float x, double y, double eps) {
        if (!isEqual(x, y, 0.00001)) {
            if (x > y) {
                System.out.println(x + " more than " + y);
            } else {
                System.out.println(y + " more than " + x);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        String input = scanner.nextLine();
        int operation = Integer.parseInt(input);
        switch (operation) {
            case 1:
                System.out.println("Enter the first digit (float):");
                float firstUserDigit = scanner.nextFloat();
                System.out.println("Enter the second digit (double):");
                double secondUserDigit = scanner.nextDouble();
                if (!isEqual(firstUserDigit, secondUserDigit, 0.000001)) {
                    getBiggest(firstUserDigit, secondUserDigit, 0.000001);
                } else {
                    System.out.println("The numbers are equal");
                }
                break;
            case 2:
                System.out.println("Enter the digit:");
                double userDigit = scanner.nextDouble();
                System.out.println("After rounding: " + Math.round(userDigit));
                break;
            case 3:
                System.out.println("Enter the digit:");
                double d = scanner.nextDouble();
                long x = (long) d;
                System.out.println("After discarding the fractional part: " + x);
                break;
            default:
                System.out.println("Bye-bye!");
                break;
        }
        scanner.close();
    }
}