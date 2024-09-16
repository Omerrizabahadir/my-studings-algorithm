package star_pattern;

public class Main1 {

    /*
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *
                * * * * * *
               * * * * * * *
              * * * * * * * *
             * * * * * * * * *
            * * * * * * * * * *
           * * * * * * * * * * *
          * * * * * * * * * * * *
         * * * * * * * * * * * * *
        * * * * * * * * * * * * * *
     */
    public static void main(String[] args) {

        int satirSayisi = 15;

        for (int i = 1; i < satirSayisi; i++) {

            for (int j = 0; j < satirSayisi - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
