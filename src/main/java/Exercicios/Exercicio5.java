package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite o sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println(nome + ", o seu IMC é: " + String.format("%.2f", imc));

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc < 24.9){
            System.out.println("Peso ideal");
        } else if (imc > 24.9 && imc < 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc > 29.9 && imc < 34.9){
            System.out.println("Obesidade grau I");
        } else if (imc > 34.9 && imc < 39.9){
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}
