import java.util.Scanner;

public class CombinedPrograms {
    
    // 1. Find LCM of two numbers
    public static void findLCM(Scanner sc) {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is: " + max);
                break;
            }
            max++;
        }
    }

    // 2. Perform Matrix Subtraction
    public static void matrixSubtraction(Scanner sc) {
        System.out.print("Enter rows and columns of matrices: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] diff = new int[r][c];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();

        // Subtract matrices
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                diff[i][j] = A[i][j] - B[i][j];

        System.out.println("Result of Matrix Subtraction:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(diff[i][j] + " ");
            System.out.println();
        }
    }

    // 3. Check Palindrome Number
    public static void checkPalindrome(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a Palindrome.");
        else
            System.out.println(original + " is NOT a Palindrome.");
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Find LCM of two numbers");
            System.out.println("2. Matrix Subtraction");
            System.out.println("3. Check Palindrome Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: findLCM(sc); break;
                case 2: matrixSubtraction(sc); break;
                case 3: checkPalindrome(sc); break;
                case 4: System.out.println("Exiting program..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
                  }
