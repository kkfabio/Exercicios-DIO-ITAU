package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome1 = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade1 = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome2 = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade2 = sc.nextInt();

        int difIdade = idade1 -  idade2;

        System.out.printf("A diferença da idade entre %s e %s é de %s", nome1, nome2,difIdade);
    }
}
