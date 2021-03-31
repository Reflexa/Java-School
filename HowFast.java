import java.util.Scanner;  // Задача II
public class HowFast {
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Въведи число = ");
    int num = Integer.parseInt(scanner.nextLine());
    if (num<=10) {
      System.out.println("Slow");
    } else if (num<=50) {
      System.out.println("Average");
    }  else if (num<=150) {
        System.out.println("Fast"); 
      }  else if (num<=1000) {
        System.out.println("Ultra fast"); 
        }  else {
        System.out.println("Extremely fast"); 
    }
  }
}
