import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of space-separated elements: ");
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split(" ");
        System.out.println("You entered the following array:");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Element " + (i) + ": " + inputArray[i]);
        }

    }
}