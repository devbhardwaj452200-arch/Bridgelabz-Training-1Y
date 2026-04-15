import java.util.*;

// MealPlan interface
interface MealPlan {
    void showMeal();
}

// Vegetarian Meal
class VegetarianMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegetarian Meal: Salad, Paneer, Fruits");
    }
}

// Vegan Meal
class VeganMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegan Meal: Tofu, Veggies, Nuts");
    }
}

// Keto Meal
class KetoMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Keto Meal: Eggs, Avocado, Chicken");
    }
}

// High Protein Meal
class HighProteinMeal implements MealPlan {
    public void showMeal() {
        System.out.println("High Protein Meal: Chicken, Lentils, Protein Shake");
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private T meal;

    public void setMeal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

// Utility class with generic method
class MealGenerator {

    // Generic method
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generating your personalized meal plan...");
        meal.showMeal();
    }
}

// Test class
public class MealTest {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>();
        vegMeal.setMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMeal = new Meal<>();
        veganMeal.setMeal(new VeganMeal());

        Meal<KetoMeal> ketoMeal = new Meal<>();
        ketoMeal.setMeal(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal = new Meal<>();
        proteinMeal.setMeal(new HighProteinMeal());

        // Generate meals using generic method
        MealGenerator.generateMeal(vegMeal.getMeal());
        MealGenerator.generateMeal(veganMeal.getMeal());
        MealGenerator.generateMeal(ketoMeal.getMeal());
        MealGenerator.generateMeal(proteinMeal.getMeal());
    }
}
