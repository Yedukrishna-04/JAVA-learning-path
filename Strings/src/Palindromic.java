import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        String rev = sb.toString();

        if(str.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No
        }
    }
}
