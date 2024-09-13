import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int userInteger;
        int evenChecker = 2;

        //input
        System.out.println("Please enter a whole number integer.");
        userInteger = scan.nextInt();

        //process and output
        if (userInteger % evenChecker == 0) {
            System.out.println("Your integer " + userInteger + " is an even integer.");
        } else {
            System.out.println("Your integer " + userInteger + " is an odd integer.");

        }
    }
}