public class nonprimitive {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("String is:"+str);

        String str1 = new String("Programmer");
        System.out.println("Another String is:"+str1);
        System.out.println(str.charAt(2));

        String str3 = """
                Lyrics for the song me and the devil:
                Early this morning
                When you knocked upon my door
                Early this morning
                When you knocked upon my door
                And I said hello Satan, ah
                I believe it is time to go
                Me and the devil walkin' side by side
                Me and the devil walking side by side
                And I'm gonna see my man
                Until I get satisfied
                See, see, you don't see why
                And you would dog me 'round
                See, don't see why
                People dog me around
                It must be that old evil spirit
                So deep down in your ground
                You may bury my body
                Down by the highway side
                You may bury my body
                Down by the highway side
                So my old evil spirit
                Can Greyhound bus that ride
                So my old evil spirit
                Can Greyhound bus that ride
                """;
        System.out.println(str3);

        int arr[];//creates array of  a particular data type
        arr =  new int[2];//defines size of array
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(arr);//prints footprint or memory location of array
        System.out.println(arr[0]);//prints assigned value at particular index
    }
}
