import java.util.Scanner;
 
public class Summ-seconds {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Въведи число №1 = ");
        int timeFirst = Integer.parseInt(scanner.nextLine());
                System.out.print("Въведи число №2 = ");
        int timeSecond = Integer.parseInt(scanner.nextLine());
                System.out.print("Въведи число №3 = ");
        int timeThird = Integer.parseInt(scanner.nextLine());
        int totalTime = timeFirst + timeSecond + timeThird;
        int minutes = totalTime / 60;
                int seconds = totalTime % 60;
                if (seconds < 10) {
                    System.out.printf("%d:%02d" , minutes, seconds);
                } else {
                    System.out.printf("%d:%02d" , minutes, seconds);
                }    
    }
}
