import java.util.Scanner;
 public class Time+15 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведи час = ");
        int hour = Integer.parseInt(scanner.nextLine());
                System.out.print("Въведи минути = ");
        int min = Integer.parseInt(scanner.nextLine());
        min = min + 15;
        if (min > 59) 
                {
            min -= 60;
            hour += hour;
        }
        if (chasove == 24) 
        {
            chasove = 0;
        }
        if (min < 10) {
            System.out.println("Време = "+ hour + ":0" + min);
        } else {
            System.out.println("Време = "+ hour + ":" + min);
        }
    }
}
