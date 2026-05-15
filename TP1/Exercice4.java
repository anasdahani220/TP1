import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez N : ");
        int n = sc.nextInt();

        int somme = 0;
        int i = 1;
        while (i <= n) {
            somme += i;
            i++;
        }

        System.out.println("La somme des " + n + " premiers entiers est : " + somme);

        sc.close();
    }
}
