import java.util.Scanner;

/**
 * Created by victoria on 06/03/21.
 */

public class Cookie {

    private int numberOfCookies;

    private double sugar, butter, selfRaisingFlour, egg, chocolateChips;

    Scanner scanner = new Scanner(System.in);

    public int getNumberOfCookies() {
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

    public void calculateIngredients(int numberOfCookies) {
        //Work out the amount of ingredients required.
        sugar = 4 * numberOfCookies / 12;
        butter = 4 * numberOfCookies / 12;
        selfRaisingFlour = 8 * numberOfCookies / 12;
        egg = 1.0 * numberOfCookies / 12;
        chocolateChips = 4 * numberOfCookies / 12;

        //Print output with amounts depending on number of cookies
        System.out.println("Recipe : Chocolate chip cookies");
        System.out.println("Ingredients :");
        System.out.println(sugar + " oz sugar");
        System.out.println(butter + " oz butter");
        System.out.println(selfRaisingFlour + " oz self raising flour");
        System.out.println(egg + " egg");
        System.out.println("vanilla essence");
        System.out.println(chocolateChips + " oz chocolate chips");
    }

    public void printRecipeMethod() {
        //Leave gap between ingredients and method
        System.out.println(" ");

        //Print out the recipe method
        System.out.println("Step 1 : Mix sugar, butter and "
                + "self raising flour thoroughly.");
        System.out.println("Step 2 : Stir in egg, a few "
                + "drops of vanilla essence and chocolate chips.");
        System.out.println("Step 3 : Roll out mixture and "
                + "cut out cookies.");
        System.out.println("Step 4 : Bake in hot oven "
                + "(Gas Mark 6) for 10-12 minutes.");
    }
}
