import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String a = scanner.next();
      int c = a.length()/2;
      String big = a.toUpperCase();
        System.out.print(big.substring(0,c));
        System.out.println(a.substring(3));
    }
}