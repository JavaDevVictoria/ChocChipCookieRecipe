import java.util.Scanner;

/**
 * Created by victoria on 07/03/21.
 */
public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static int getNumberOfCookies() {
        int numberOfCookies;
        //Prompt user for number of cookies required.
        System.out.print("Enter the number of cookies required:");
        numberOfCookies = scanner.nextInt();

        //Check for errors
        while (numberOfCookies < 0) {
            System.out.println("Error: The number of cookies must be positive.");
            System.out.println("Enter the number of cookies required:");
            numberOfCookies = scanner.nextInt();
        }

        return numberOfCookies;
    }
}
