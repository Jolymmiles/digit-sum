import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String digit1 = a.substring(0, 1), digit2 = a.substring(1, 2), digit3 = a.substring(2, 3);
        System.out.print(  Integer.parseInt(a.substring(0, 1).trim()) + Integer.parseInt(a.substring(1, 2).trim()) + Integer.parseInt(a.substring(2, 3).trim()));

    }
}
