/**
 * Created by victoria on 07/03/21.
 */
public class IngredientsCalculator {

    private double sugar, butter, selfRaisingFlour, egg, chocolateChips;
    private int numberOfCookies;

    public IngredientsCalculator(int numberOfCookies) {
        this.numberOfCookies = numberOfCookies;
    }

    public void calculateIngredients() {
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
}
