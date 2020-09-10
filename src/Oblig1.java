/* Skrevet og levert av Morten Bråtesveen-Skråmestø. S326152. s326152@oslomet.no */

import java.util.Arrays;

public class Oblig1{

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

    // Oppgave 3 //

    public static int antallUlikeUsortert(int[] a){

        int unike = 1;

        if(a.length == 0){
            unike = 0;
        }else if(a.length == 1){
            return unike;
        }else{
            for(int i = 1; i < a.length; i++){
                int j = 0;
                for(j = 0; j < i; j++){
                    if(a[i] == a[j]){
                        break;
                    }
                }
                if(i == j){
                    unike += 1;
                }
            }
        }

        return unike;

    }

    // Oppgave 4 //

    public static void delsortering(int[] a){

        int venstre = 0;
        int hoyre = a.length - 1;
        int teller = 0;
        int temp = 0;

        while(venstre < hoyre){
            while((a[venstre]%2) != 0){
                venstre += 1;
                teller += 1;
                if(venstre > hoyre){
                    venstre = hoyre;
                    break;
                }
            }
            while(((a[hoyre]%2) == 0) && venstre < hoyre){
                hoyre -= 1;
            }
            if(venstre < hoyre){
                temp = a[venstre];
                a[venstre] = a[hoyre];
                a[hoyre] = temp;
            }
        }

        Arrays.sort(a, 0, teller);
        Arrays.sort(a, teller, a.length);

    }

    // Oppgave 5 //

    public static void rotasjon(char[] a){

        int antRot = 1;
        int temp = 0;

        if(a.length < 2){
            return;
        }

        for(int i = a.length - 1; i >= antRot; i--){
            temp = a[i];
            a[i] = a[i - antRot];
            a[i - antRot] = (char) temp;
        }

    }

}
