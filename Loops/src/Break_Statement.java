/*used to terminate loop it is enclosed inside.resumes control at the next*/
public class Break_Statement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5){
                System.out.println("After the loop");
                break;
            }
            System.out.println(i);
        }
    }

}
