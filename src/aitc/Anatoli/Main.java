package aitc.Anatoli;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Armenian-Indian center!");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        Factorial ff = new Factorial();
        System.out.println("factorial value is equal to " + ff.factorial1(n = 22));

    }
}