package aitc.Anatoli;

/**
 * Created by Studenta on 25-Apr-17.
 */
public class Factorial {

    public long factorial1 (int n) {

        if ( n < 0) throw new IllegalArgumentException ("n number");


        if(1 == n) {
            return 1;
        }else{


            return  n*factorial1(n-1);
        }


    }

}




