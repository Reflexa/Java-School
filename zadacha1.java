import java.util.Scanner; // Задача I
public class zadacha1 {
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Въведи число = ");
    int num = Integer.parseInt(scanner.nextLine());
    if (num<=100) {
            System.out.print("Less than 100");
       } else if (num<=200) {
      System.out.print("Between 100 and 200");
        } else if (num>200) {
      System.out.print("Greater than 200");
    }
  }
}
