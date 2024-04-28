package PROBLEM2;

import java.util.Scanner;

public class DecoratorPatternCustomer {
    private static int choice;
    public static void main(String args[]) throws NumberFormatException   {
        do{
            System.out.print("                      ========= Food Menu ============                            \n");
            System.out.print("            1. Combo Meal 1: Beef burger with French fry and cheese               \n");
            System.out.print("            2. Combo Meal 2: Veggi Burger with onion rings and Bottle of Water.   \n");
            System.out.print("            3. Combo Meal 3: Veggi burger with French Fry and Coke                \n");
            System.out.print("            4. Combo Meal 4: Veggi burger with Onion Rings, Coffee and Water      \n");
            System.out.print("            5. Combo Meal 5: A Beef burger only                                   \n");
            System.out.print("            6. Exit                                                               \n");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice=Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:{
                    MainCourse combo1=new MealCombo1((MainCourse) new BeefBurger());
                    combo1.prepareMeal();
                    System.out.println("Total price: " +  combo1.mealPrice());
                }
                break;

                case 2:{
                    MainCourse combo2=new MealCombo2((MainCourse) new VeggiBurger());
                    combo2.prepareMeal();
                    System.out.println("Total price: " +  combo2.mealPrice());
                }
                break;
                case 3:{
                    MainCourse combo3=new MealCombo3((MainCourse) new VeggiBurger());
                    combo3.prepareMeal();
                    System.out.println("Total price: " +  combo3.mealPrice());
                }
                break;

                case 4:{
                    MainCourse combo4=new MealCombo4((MainCourse) new VeggiBurger());
                    combo4.prepareMeal();
                    System.out.println("Total price: " +  combo4.mealPrice());
                }
                break;

                case 5:{
                    BeefBurger combo5 = new BeefBurger();
                    combo5.prepareMeal();
                    System.out.println("Total price: " +  combo5.mealPrice());
                }
                break;

                default:{
                    System.out.println("Other than these no food available");
                }
                return;
            }//end of switch

        }while(choice!=6);
    }
}
