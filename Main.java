package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while(true){
            int a, b;

            a = ler.nextInt();
            b = ler.nextInt();

            if(a == 0 && b == 0) break;

            int na[] = new int[a];
            int nb[] = new int[b];

            for(int i = 0; i < a; i ++){
                na[i] = ler.nextInt();
            }
            for(int i = 0; i < b; i ++){
                nb[i] = ler.nextInt();
            }

            Impedidos aux = new Impedidos();

            aux.resultado(a, b, na, nb);

            if(aux.geti()) System.out.println("Y\n");
            else System.out.println("N\n");
        }
    }
}
