import java.util.Scanner;

public class Largest_N_Number {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("The Number is:"+N);
        int maxValue = Integer.MIN_VALUE;
        for(int i = 1; i <= N; i++){
            int current = scanner.nextInt();
            maxValue = Math.max(maxValue, current);
        }
        System.out.println("The Max Value is:"+maxValue);
    }
}
