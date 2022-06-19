package Day05_operators;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Dört basamaklı bir sayi giriniz?");

        int sayi=scan.nextInt();
        int birlerBasamagi=sayi%10;
        int onlarBasamagi=(sayi/10)%10;
        int yuzlerBasamagi=(sayi/100)%10;
        int binlerBasamagi=(sayi/1000)%10;

        System.out.println("basamakları toplamı:"+(birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi));
    }
}
