package com.personalizedmealplangenerator;

public class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan){
        System.out.println("Validating meal plan...");
        // Add validation logic if needed
        System.out.println("Meal plan validated successfully!");
        return new Meal<>(mealPlan);
    }
}
