public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World!");
        sb.insert(5, " Programmer& ");
        System.out.println(sb);
        String s1 = sb.toString();
        System.out.println(s1);
        sb.replace(6,16, "Gamer" );
        System.out.println(sb);
        sb.delete(6,12);
        System.out.println(sb);
    }
}