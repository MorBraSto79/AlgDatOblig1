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
