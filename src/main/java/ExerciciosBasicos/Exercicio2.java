package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo: ");
        double base = sc.nextDouble();

        System.out.println("Digite o valor da alura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.print("O valor da área desse quadrado é: " + area);

    }

}
