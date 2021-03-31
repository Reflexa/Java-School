import java.util.Scanner;
public class Fruit-Vege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String food = (scanner.nextLine());
            switch (food) {
                case "banana":
                case "apple":
                case "kiwi":
                case "cherry":
                case "lemon":
                case "grapes":
                System.out.println("Fruit");
                break;
                case "tomato":
                case "cucumber":
                case "pepper":
                case "carrot":
                System.out.println("Vegetable");
                break;
                default:
                System.out.println("Unknown");
                break;
            }
        }
}
