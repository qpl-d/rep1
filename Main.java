import java.util.Scanner;
import java.io.PrintStream;

public class Main {
    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();

        StringBuilder bin = new StringBuilder();

        if (n == 0) {
            bin.append(0);
        }
        else {
            while (n > 0) {
                bin.append(n % 2);
                n = n / 2;
            }
        }
        bin.reverse();
        out.println(bin);
    }
}

