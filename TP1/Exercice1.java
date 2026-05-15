import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println(n + " est Positif.");
        } else if (n < 0) {
            System.out.println(n + " est Négatif.");
        } else {
            System.out.println("Le nombre est Nul.");
        }

        sc.close();
    }
}
