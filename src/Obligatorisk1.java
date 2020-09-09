/* Skrevet og levert av Morten Bråtesveen-Skråmestø. S326152. s326152@oslomet.no */

import java.util.Arrays;

public class Obligatorisk1 {

    public static int maks(int[] a){

        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int temp;

        return a[a.length - 1];
    }

}
