import java.util.Scanner;

public class Day_in_a_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Month:");
        String month = sc.nextLine();

        System.out.print("Enter the Year:");
        int year = sc.nextInt();

        boolean LeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        //switch
        switch (month){
            case "January", "March", "May", "July", "August","October","December":
                System.out.println("31 days");
                break;
            case "February":
                if (LeapYear){
                    System.out.println("29 Days");
                }else{
                    System.out.println("28 Days");
                }
                break;
            case "April", "June","September","November":
                System.out.println("30 days");
                break;
            default:
                System.out.println("Not A month");
        }
    }
}
