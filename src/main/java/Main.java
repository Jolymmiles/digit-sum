import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //System.out.print(a.substring(1, 2));
        System.out.print(  Integer.parseInt(a.substring(0, 1).trim()) + Integer.parseInt(a.substring(1, 2).trim()) + Integer.parseInt(a.substring(2, 3).trim()));
    }
}
