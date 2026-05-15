import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrice = new int[3][3];

        System.out.println("Saisie des éléments de la matrice 3x3 :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matrice[" + i + "][" + j + "] = ");
                matrice[i][j] = sc.nextInt();
            }
        }

        int somme = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somme += matrice[i][j];
            }
        }

        System.out.println("La somme de tous les éléments est : " + somme);

        sc.close();
    }
}
