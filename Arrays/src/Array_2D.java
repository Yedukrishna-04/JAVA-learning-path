public class Array_2D {
    public static void main(String[] args) {
        int stu_marks [] [] = {{10,20, 30, 40, 50}, {11, 22, 33, 44, 55}, {12, 15 ,14, 19, 27}};
        int summax = 0;
        int maxrow = 0;
        for(int i=0; i<stu_marks.length; i++){
            int total_marks = 0;
            for(int j=0; j<stu_marks[i].length; j++){
                total_marks += stu_marks[i][j];
            }
            System.out.println("Total Mark of Student"  +i+  "is" +total_marks);
            if (total_marks > summax){
                summax = total_marks;
                maxrow = i;
            }
        }
        System.out.println("Max Number is"+summax+"and max row is"+maxrow);
    }
}
