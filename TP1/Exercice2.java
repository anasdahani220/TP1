import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le premier nombre : ");
        double a = sc.nextDouble();
        System.out.print("Entrez le deuxième nombre : ");
        double b = sc.nextDouble();
        System.out.print("Entrez le troisième nombre : ");
        double c = sc.nextDouble();

        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Le plus grand est : " + max);

        sc.close();
    }
}
