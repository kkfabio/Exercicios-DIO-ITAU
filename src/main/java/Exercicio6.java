import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();

        int num2 = 0;

        do {
            System.out.printf("Digite outro número (Esse outro número deve ser maior que %s): ", num1);
            num2 = sc.nextInt();
            if (num1 >= num2) {
                System.out.printf("Erro, o segundo número deve ser maior que o %s\n", num1);
            }
        } while (num2 <= num1);

        String opcao = "";
        do {
            System.out.println("Digite a sua opção: \nPares\nÍmpares");
            opcao = sc.next();
            if (!opcao.equalsIgnoreCase("pares") && !opcao.equalsIgnoreCase("impares")) {
                System.out.println("Erro, escolha uma das opções acima.");
            } else {
                continue;
            }
        } while (!opcao.equalsIgnoreCase("pares") && !opcao.equalsIgnoreCase("impares"));

        for (int i = num2; i >= num1; i--) {
            if (opcao.equalsIgnoreCase("pares") && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao.equalsIgnoreCase("impares") && i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}