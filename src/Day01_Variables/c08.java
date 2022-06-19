package Day01_Variables;

import java.util.Scanner;

public class c08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("karenin bir kenar uzunluğunu giriniz?");

        int a=scan.nextInt();

        int alan=a*a;
        int cevre=4*a;
        System.out.println("Kare'nin alanı:"+alan+"\n"+"Kare'nin cevresi:"+cevre);

    }
}
