public class NEW_mETHOD {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 ="abc";
        String s3 = new String("abc");

        // if (s1 == s2)
        if (s1.equals(s2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

        // if (s1 == s3)
        if (s1 == s3){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
