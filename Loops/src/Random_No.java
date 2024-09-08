public class Random_No {
    public static void main(String[] args) {
        while(true) {
            int num = (int) (Math.random() * 10 + 1);
                if (num == 5){
                    break;
                }if (num % 4 == 0){
                    continue;
            }
                System.out.println(num);
            }
    }
}
