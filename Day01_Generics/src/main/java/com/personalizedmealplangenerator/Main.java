package com.personalizedmealplangenerator;

public class Main {

        public static void main(String[] args) {
            Meal<VegetarianMeal> vegetarianMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
            Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMealPlan(new VeganMeal());


            System.out.println("\n--- Personalized Meal Plans ---");
            vegetarianMeal.display();
            veganMeal.display();

        }
    }

