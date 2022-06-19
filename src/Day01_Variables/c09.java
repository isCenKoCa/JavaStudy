package Day01_Variables;

import java.util.Scanner;

public class c09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Yarıçap giriniz?");
         //pi=3
        int r=scan.nextInt();
        int cevre=(2*3*r);
        int alan=(3*r*r);

        System.out.println("Çemberin çevresi:"+cevre);
        System.out.println("Daire'nin alanı:"+alan);

    }

}
