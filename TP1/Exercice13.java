import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = sc.nextLine();

        String inverse = "";
        for (int i = chaine.length() - 1; i >= 0; i--) {
            inverse += chaine.charAt(i);
        }

        System.out.println("Chaîne inversée : " + inverse);

        sc.close();
    }
}
