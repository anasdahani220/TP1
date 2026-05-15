import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[10];

        System.out.println("Remplissage du tableau de 10 entiers :");
        for (int i = 0; i < 10; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }

        System.out.print("Entrez le nombre à rechercher : ");
        int x = sc.nextInt();

        boolean trouve = false;
        for (int i = 0; i < 10; i++) {
            if (tab[i] == x) {
                System.out.println("Le nombre " + x + " est à la position " + i);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Le nombre " + x + " n'est pas dans le tableau.");
        }

        sc.close();
    }
}
