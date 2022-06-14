public class Main {
    public static void main(String[] args) {

        // Задание 1

        int i = 0;

        while (i < 10) {

            i++;

            System.out.print(i + " ");

        }


        System.out.println();


        for (int n = 10 ; n > 0; n -- ) {

            System.out.print( n + " " );

        }

        System.out.println();
        System.out.println();

        // Задание 2


        for ( int firstFriday = 3 ; firstFriday < 31; firstFriday = firstFriday + 7 ) {

            System.out.println( "Today is friday: " + firstFriday + " You have to prepare report! ");
        }
        System.out.println();

        // Задание 3

        int currentYear = 2022;
        int period = 79;

        for (int y = 0; y < currentYear + period; y = y + period) {
            if ( y > currentYear - 200) {
                System.out.println(y);
            }
        }



    }
}
