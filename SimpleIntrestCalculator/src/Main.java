import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle:");
        int p = scanner.nextInt();
        System.out.print("Enter Rate:");
        int r = scanner.nextInt();
        System.out.print("Enter Time:");
        int t = scanner.nextInt();
        int si = (p *  r * t)/100;
        System.out.println("Simple Interest:"+si);
    }
}