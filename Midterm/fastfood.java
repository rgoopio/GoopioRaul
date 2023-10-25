import java.util.*;

public class fastfood {

  final static double adultMealPrice = 109.00;
  final static double kidMealPrice = 250.00;
  
  public static void main(String []ahh) {
    
    Scanner sc = new Scanner(System.in);
       
    System.out.print("Number Of Adult Meals: ");
    int numAdultMeal = sc.nextInt();
    System.out.print("Number Of Kiddie Meals: ");
    int numKidMeal = sc.nextInt();
    
    double totalAdultPrice = numAdultMeal * adultMealPrice;
    double totalKidPrice = numKidMeal * kidMealPrice;
    
    System.out.println("Total Price for Adult Meal/s: " +totalAdultPrice);   
    System.out.println("Total Price for Kiddie Meal/s: " +totalKidPrice); 

  }
}