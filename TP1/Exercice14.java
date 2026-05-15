import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = sc.nextLine();

        // On ignore la casse et les espaces
        String chaineNettoyee = chaine.replaceAll("\\s+", "").toLowerCase();

        boolean estPalindrome = true;
        int n = chaineNettoyee.length();
        for (int i = 0; i < n / 2; i++) {
            if (chaineNettoyee.charAt(i) != chaineNettoyee.charAt(n - 1 - i)) {
                estPalindrome = false;
                break;
            }
        }

        if (estPalindrome) {
            System.out.println("\"" + chaine + "\" est un palindrome.");
        } else {
            System.out.println("\"" + chaine + "\" n'est pas un palindrome.");
        }

        sc.close();
    }
}
