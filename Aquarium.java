import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Дължина в см = ");
        int lengthcm = Integer.parseInt(scanner.nextLine());
        System.out.print("Широчина в см = ");
        int widthcm = Integer.parseInt(scanner.nextLine());
        System.out.print("Височина в см = ");
        int heightcm = Integer.parseInt(scanner.nextLine());
        System.out.print("Процент = ");
        double percent = Double.parseDouble(scanner.nextLine());
        double capacity = lengthcm * widthcm * heightcm;
        double totalliters = capacity * 0.001;
        double percentage = percent * 0.01;
        double finalliters = totalliters * (1 - percentage);
        System.out.printf("Литрите, които реално ще трябват = %.2f", finalliters);
    }
}
