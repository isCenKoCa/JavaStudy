package Day01_Variables;

import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Adınız ve Soyadınız?");

        String ad=scan.nextLine();
        String soyad=scan.nextLine();

        System.out.println("İsminiz-Soyisminiz:"+ad+" "+soyad);
    }
}
