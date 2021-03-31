import java.util.Scanner;
public class Comparison {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.print("Въведете чисоло за сравнение = ");
int chislo1 = Integer.parseInt(scanner.nextLine());
System.out.print("Въведете чисоло за сравнение = ");
int chislo2 = Integer.parseInt(scanner.nextLine());

if (chislo1 > chislo2){

System.out.println(chislo1);
}
else {
System.out.println(chislo2);
}
}
}
