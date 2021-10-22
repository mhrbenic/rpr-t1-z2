package ba.unsa.etf.rpr.predavanje02;
import java.util.Scanner;

public class Main {
    static int sumaCifara(int n) {
        int cifra=0,suma=0;
        do{
            cifra=n%10;
            suma=suma+cifra;
            n=n/10;
        }while(n>0);
        return suma;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Unesite broj n: ");
        Scanner ulaz= new Scanner(System.in);
        n=ulaz.nextInt();
        for(int i=1; i<n; i++){
            int sumacifara=sumaCifara(i);
            if(i%sumacifara==0)
                System.out.println((i)+" ");
        }
    }
}
