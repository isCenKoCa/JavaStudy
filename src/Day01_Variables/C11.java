package Day01_Variables;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Adınızı ve Soyadınızı giriniz?");
        String ad=scan.nextLine();
        String soyad=scan.nextLine();

        System.out.println("İsminiz:"+ad+"\n"+"Soyisminiz:"+soyad+"\n"+"Kurs için kaydınız oluşturulmuştur.");
    }
}
