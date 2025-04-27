//Version 2.0

import java.util.Random;
import java.util.Scanner;


public static void main(String[] args) {
    int i = 1;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int n = rand.nextInt(51);

    System.out.println("Zgadnij o jakiej liczbie myśle od 0 do 50");
    int a = scan.nextInt();

    while(a != n) {
        if (a > n) {
            System.out.println("Podałeś za dużą liczbe, spróbuj jeszcze raz");
        } else if (a < n) {
            System.out.println("Podałeś za małą liczbe, spróbuj jeszcze raz");
        }

        i++;
        licznikPrób(i);
        a = scan.nextInt();
        pozostałePróby(i);
    }
    System.out.println("Brawo zgadłeś o jakiej liczbie myślałem za " + i + " razem");
}

public static void licznikPrób(int i) {
    if (i > 10) {
        System.out.println("Przekroczyłeś 10 prób! Gra zakończona.");
        System.exit(0);
    }
}

public static void pozostałePróby(int i){
    int x = 10 - i;
    System.out.println("Pozostało " + x + " Prób");
}


