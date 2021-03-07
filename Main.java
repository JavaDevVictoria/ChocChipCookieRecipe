/**
 * Created by victoria on 06/03/21.
 */
public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        IngredientsCalculator calculator = new IngredientsCalculator(console.getNumberOfCookies());
        calculator.calculateIngredients();
        RecipeMethodPrinter recipeMethodPrinter = new RecipeMethodPrinter();
        recipeMethodPrinter.printRecipeMethod();
    }
}
