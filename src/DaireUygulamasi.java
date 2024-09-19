import java.security.DrbgParameters;
import java.util.Scanner;

public class DaireUygulamasi {
    public static void main(String[] s){
Daire daire1=new Daire(3,4,7);
System.out.println(daire1);
System.out.println(daire1.AlanHesapla());
Daire daire4=new Daire(5,4);
System.out.println(daire4);
System.out.println(daire4.AlanHesapla());
System.out.println(daire1.getX());
System.out.println(daire4.getX());
System.out.println(daire1.setX(11));
System.out.println(daire4.setX(9));


    }
}
