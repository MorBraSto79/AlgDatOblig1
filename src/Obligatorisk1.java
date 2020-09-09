/* Skrevet og levert av Morten Bråtesveen-Skråmestø. S326152. s326152@oslomet.no */

import java.util.Arrays;

public class Obligatorisk1 {

    // Oppgave 1 //

    public static int maks(int[] a){

        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int temp;

        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i + 1]){
                temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }

        return a[a.length - 1];

    }

    public static int ombyttinger(int[] a){

        if(a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int temp;
        int bytting = 0;

        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i + 1]){
                temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
                bytting += 1;
            }
        }

        return bytting;
    }

    // Oppgave 2 //

    public static int antallUlikeSortert(int[] a){

        int antallUlike = 1;

        if(a.length == 0){
            antallUlike = 0;
        }else if(a.length == 1){
            return antallUlike;
        }else if(a.length > 1){
            for(int i = 0; i < a.length - 1; i++){
                if(a[i] < a[i + 1]){
                    antallUlike += 1;
                }else if(a[i] == a[i + 1]){
                    continue;
                }else{
                    throw new IllegalStateException("Tabellen er ikke sortert i stigende rekkefølge");
                }
            }
        }

        return antallUlike;

    }

}
