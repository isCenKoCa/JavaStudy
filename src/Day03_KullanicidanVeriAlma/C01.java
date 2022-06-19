package Day03_KullanicidanVeriAlma;


import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen iki tane tam sayi giriniz?");

        int s1=input.nextInt();
        int s2=input.nextInt();

        int Toplam=s2+s1;
        int fark=s2-s1;
        int carpim=s2*s1;
        int bolum=s2/s1;
        System.out.println("Toplam:"+Toplam+"\n"+"fark:"+fark+"\n"+"carpim:"+carpim+"\n"+"bolum:"+bolum);
    }

}
