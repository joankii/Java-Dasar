public class TipeDataArray {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3]; /* versi manual untuk menentukan jumlah isi array */

        stringArray[0] = "Jo";
        stringArray[1] = "an";
        stringArray[2] = "kii";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        /* Array Initializer */

        String[] namaNama = {
                "jo" , "an" , "ki"
        };
         int[] arrayInt = new int[]{
                 1 , 2 , 3 , 4 , 5 , 6 , 7 ,8 ,9
         };

         long[] arrayLong = {
                 10L , 20L , 30L
         };

        System.out.println(arrayLong.length);

        /* Array di dalam Array */

        String[][] members = {
                {"jo" , "an"},
                {"kii" , "an"},
                {"joko"}
        };

        System.out.println(members[1][0]);

    }
}
