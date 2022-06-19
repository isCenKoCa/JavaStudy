package Day05_operators;

import java.util.Scanner;

public class C02_rakamToplami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
     int toplam=0;
        System.out.println("Bir sayi giriniz?");
        int sayi=scan.nextInt();

        while(sayi!=0) {
            toplam=(sayi%10)+toplam;
            sayi/=10;

        }
        System.out.println("Girilen sayının Basamak toplamı:"+toplam);

    }
}
