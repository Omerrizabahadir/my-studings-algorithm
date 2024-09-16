package star_pattern;

public class Main2 {

    /*
                    * * * * * * * * * * * * * * *
                     * * * * * * * * * * * * * *
                      * * * * * * * * * * * * *
                       * * * * * * * * * * * *
                        * * * * * * * * * * *
                         * * * * * * * * * *
                          * * * * * * * * *
                           * * * * * * * *
                            * * * * * * *
                             * * * * * *
                              * * * * *
                               * * * *
                                * * *
                                 * *
                                  *


     */

    public static void main(String[] args) {

        int satirSayisi = 15;

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = (satirSayisi - i -1); k >0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}