package Day04_increments;

import java.util.Scanner;

public class c01 {
    public static void main(String[] args) {

       Scanner sken =new Scanner(System.in);

        System.out.println("iki sayı gir?");

         double a=sken.nextDouble();
        double b=sken.nextDouble();

        System.out.println("a ve b'nin toplamı:"+(a+b)+"\n"+"a ve b'nin farkı:"+(a-b)+"\n"+"a ve b'nin çarpımı:"+(a*b)+"\n"+"a ve b'nin bölümü:"+(a/b));




    }

}
