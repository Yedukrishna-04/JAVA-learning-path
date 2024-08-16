import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        String ans = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(ans);
    }
}
