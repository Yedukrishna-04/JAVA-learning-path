import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int Number = sc.nextInt();
        if(Number % 2 == 0){
            System.out.println("Number is even");
        } else if (Number == 0) {
            System.out.println("Number is zero");
        }else {
            System.out.println("Number is odd");
        }
    }
}