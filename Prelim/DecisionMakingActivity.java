import java.util.Scanner;

public class DecisionMakingActivity {

    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("");
    System.out.print("Route to MoalBoal\n");
    System.out.println("");
    System.out.print("Is route A obstructured? (Y = 1 || N = 0): ");
    int isRouteObstructured = sc.nextInt();
    
    if(isRouteObstructured == 0 ) {
     System.out.println("Proceed to Default Route: ");
     System.out.println("Route 1: Mingla");
     System.out.println("Route 2: San Fernando");
     System.out.println("Route 3: Carcar");
     System.out.println("Route 4.1: Barili");
     System.out.println("Route 4.1.1: Dumanjug");
     System.out.println("Route 4.1.2: Alcantara");
     System.out.println("Moalboal");
    }
    else {
     System.out.println("If Route A is obstructured Proceed to Recommended Route: ");
     int routeChoice = sc.nextInt();
     
     if(routeChoice == 3) {
     System.out.println("Route 4.1: Barili is obstructured, Proceed to Route 4.2: Sibonga"); }
     else if (routeChoice == 4) {
      System.out.println("Currently in Sibonga");
      System.out.println("Route 4.2.1: Dumanjug");
      System.out.println("Route 4.2.2: Alcantara");
      System.out.println("MoalBoal");
     }  
    else {
     System.out.println("Currently in Sibonga");
     System.out.println("Proceed to Route 5: Argao");
     System.out.println("Proceed to Route 5.1: Ronda");
     System.out.println("Proceed to Route 5.2: Alcantara");
     System.out.println("MoalBoal"); }  
     
      
  }
 }
}