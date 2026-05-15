import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = sc.nextLine();

        System.out.println("La longueur de la chaîne est : " + chaine.length());

        sc.close();
    }
}
