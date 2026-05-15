import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = sc.nextLine();

        int nbVoyelles = 0;
        String voyelles = "aeiouyAEIOUY";

        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            if (voyelles.indexOf(c) != -1) {
                nbVoyelles++;
            }
        }

        System.out.println("Nombre de voyelles : " + nbVoyelles);

        sc.close();
    }
}
