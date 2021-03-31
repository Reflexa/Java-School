import java.util.Scanner;

public class Shop {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
                // Вход
        System.out.print("Броят на дните, в които тече кампанията: "); 
        double dnite = Double.parseDouble(scanner.nextLine());
                System.out.print("Броят на сладкарите: "); 
        double sladkarite = Double.parseDouble(scanner.nextLine());
                System.out.print("Броят на тортите: "); 
        double tortite = Double.parseDouble(scanner.nextLine());
                System.out.print("Броят на гофретите: "); 
        double gofretite = Double.parseDouble(scanner.nextLine());
                System.out.print("Броят на палачинките: "); 
        double palachinkite = Double.parseDouble(scanner.nextLine());
       
              // Изчисления
        double torti = 14 * 45;
        double gofreti = 30 * 5.80;
        double palachinki = 16 * 3.20;
                double obshtasumaotsladkarite = (630 + 174 + 51.20) * 8;
                double sumasubranaotkompaniqta = 6841.60 * 23;
                double sledpokrivanenarazhodite = 157356.8 - 1/8 ;

        // Изход
        System.out.println("Парите, които са събрани " + sledpokrivanenarazhodite);
    }
}
