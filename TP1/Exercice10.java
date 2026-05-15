import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes : ");
        int n = sc.nextInt();
        System.out.print("Entrez le nombre de colonnes : ");
        int m = sc.nextInt();

        int[][] matrice = new int[n][m];
        int[][] transposee = new int[m][n];

        System.out.println("Saisie des éléments de la matrice :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrice[" + i + "][" + j + "] = ");
                matrice[i][j] = sc.nextInt();
            }
        }

        // Calcul de la transposée
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposee[j][i] = matrice[i][j];
            }
        }

        System.out.println("Matrice originale :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrice transposée :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposee[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
