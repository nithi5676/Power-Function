package powerFunction;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter power value: ");
        int power = scanner.nextInt();
        System.out.print("Enter mod value: ");
        int mod = scanner.nextInt();
        scanner.close();
        System.out.println(function(number, power, mod));
    }

    public static int function(int number, int power, int mod) {
        if (power == 0) {
            return 1;
        }
        int p = function(number, power / 2, mod);
        if (power % 2 == 0) {
            return (p * p) % mod;
        } else {
            return (p * p * number) % mod;
        }

    }

}
