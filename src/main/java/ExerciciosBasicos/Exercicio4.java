package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite o número para a criação da tabuada: ");

        int n1 = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n1 + " x " + i + " = " + n1 * i);
        }

    }
}
