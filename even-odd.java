import java.util.Scanner;
public class even-odd {
    public static void main(String args[]) {
   Scanner scan = new Scanner(System.in);
   System.out.print("Въведи число = ");
  int chislo = Integer.parseInt(scan.nextLine());
 if (chislo % 2 == 0){
         System.out.println("Четно = " + chislo);
 } else {
         System.out.println("Нечетно = " + chislo);
    }
  }
}
