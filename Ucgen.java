
import java.util.Scanner;


public class Ucgen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int kenarA,kenarB,kenarC;
        
        System.out.print("A Kenarını Uzunlugunu Giriniz :");
        kenarA=scan.nextInt();
        System.out.print("B Kenarını Uzunlugunu Giriniz :");
        kenarB=scan.nextInt();
        System.out.print("C Kenarını Uzunlugunu Giriniz :");
        kenarC=scan.nextInt();
        
        double alan,cevre,u;
        
        u=(kenarA+kenarB+kenarC)/2;
        cevre=2*u;
        alan=Math.sqrt(u*(u-kenarA)*(u-kenarB)*(u-kenarC));
        
        System.out.println("Ucgenin Cevresi :"+cevre);
        System.out.print("Ucgenin Alanı :"+alan);
        
        
        
    }
}
