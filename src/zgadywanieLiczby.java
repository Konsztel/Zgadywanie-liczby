import java.util.Random;
import java.util.Scanner;

public class zgadywanieLiczby {
    public void main() {
    }

    public static void main(String[] args) {
        int licznik = 1;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(51);
        System.out.println("Zgadnij o jakiej liczbie myśle od 0 do 50");
        int a = scan.nextInt();

        while(a != n) {
            if (a > n) {
                System.out.println("Podałeś za dużą liczbe, spróbuj jeszcze raz");
                a = scan.nextInt();
                ++licznik;
            } else if (a < n) {
                System.out.println("Podałeś za małą liczbe, spróbuj jeszcze raz");
                a = scan.nextInt();
                ++licznik;
            }
        }

        System.out.println("Brawo zgadłeś o jakiej liczbie myślałem za " + licznik + " razem");
    }
}
