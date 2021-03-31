import java.util.Scanner; // Задача Шивашки цех I Група
public class tailoring-workshop {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Вход
                System.out.print("Брой правоъгълни маси = ");
        int broiprmasi = Integer.parseInt(scan.nextLine());
                System.out.print("Дължина на правоъгълните маси в метри = ");
        double duljinanamasimetri = Double.parseDouble(scan.nextLine());
                System.out.print("Широчина на правоъгълните маси в метри = ");
        double sirochinaprmasimetri = Double.parseDouble(scan.nextLine());
                // Изчисления
        double razmer = duljinanamasimetri / 2;
        double pokrivkaUSD = 7;
        double kareUSD = 9;
        double razmerpokrivka = (broiprmasi * (duljinanamasimetri + 2 * (double) 30/100)) * (sirochinaprmasimetri + 2 * (double) 30/100);
        double squaresArea = (broiprmasi * (duljinanamasimetri / 2) * (duljinanamasimetri / 2));
        double cenaUSD = (razmerpokrivka * pokrivkaUSD) + (squaresArea * 9);
        double cenaBGN = cenaUSD * 1.85;
        // Изход
        System.out.printf("%.2f долара%n", cenaUSD);
        System.out.printf("%.2f лева", cenaBGN);
    }
}
