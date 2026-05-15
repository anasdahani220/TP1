import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau N : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }

        System.out.print("Les éléments du tableau sont : ");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
