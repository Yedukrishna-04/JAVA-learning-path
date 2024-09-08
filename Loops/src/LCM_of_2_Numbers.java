import java.util.Scanner;

public class LCM_of_2_Numbers {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        n2 = sc.nextInt();
        int lcm = (n1 > n2) ? n1 : n2;
        while(true){
            if (lcm % n1 == 0 && lcm % n2 == 0){
                System.out.println("The LCM is: "+lcm);
                break;
            }
            ++lcm;
        }
    }
}
