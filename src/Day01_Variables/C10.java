package Day01_Variables;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //Dikdörtgenler prizmasının hacmi:V=tabanalani*yükseklik
        //Taban alanı:a*b

        System.out.println("Dikdörtgenler prizmasını uzun,kısa ve yükseklik değerlerini giriniz?");
        int uzun=scan.nextInt();
        int kisa=scan.nextInt();
        int Yukseklik=scan.nextInt();

        int hacim=uzun*kisa*Yukseklik;

        System.out.println("Prizma'nın hacmi:"+hacim);
    }
}
