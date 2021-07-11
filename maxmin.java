import java.util.Scanner; // MIN / MAX / FIXED
class Main {  
  public static void main(String args[]) { 
    Scanner scanner = new Scanner(System.in);
    int min = 0;
      int max = 0;
        int vhod;
    System.out.print("Въведете дължина на числата: ");
    int duljina = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < duljina; i++) {
      System.out.print("Въведете число: ");
      vhod = Integer.parseInt(scanner.nextLine());
      if (i==0) 
        min = max = vhod;
      else
      {
        if (min > vhod) 
          min = vhod;
        if (max < vhod)
          max = vhod;
      }
    }
    System.out.println("Най-малко = " + min);
    System.out.println("Най-голямо = " + max);
    }
}
