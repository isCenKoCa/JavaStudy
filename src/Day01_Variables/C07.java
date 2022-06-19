package Day01_Variables;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Adinizi-Soyadinizi ve yaşinizi giriniz?");

        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("Girilen Bilgiler:"+isim+","+soyisim+","+yas);



    }
}
