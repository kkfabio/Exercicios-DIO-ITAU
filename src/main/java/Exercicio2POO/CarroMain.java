package Exercicio2POO;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        CarroFuncionalidades funcionalidades = new CarroFuncionalidades(carro);

        int opcao;
        do {
            System.out.println("\n========= MENU CARRO =========");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Trocar marcha");
            System.out.println("6 - Virar para esquerda");
            System.out.println("7 - Virar para direita");
            System.out.println("8 - Verificar velocidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> funcionalidades.ligar();
                case 2 -> funcionalidades.desligar();
                case 3 -> funcionalidades.acelerar();
                case 4 -> funcionalidades.diminuirVelocidade();
                case 5 -> {
                    System.out.print("Digite a marcha desejada (0 a 6): ");
                    int marcha = scanner.nextInt();
                    funcionalidades.trocarMarcha(marcha);
                }
                case 6 -> funcionalidades.virarEsquerda();
                case 7 -> funcionalidades.virarDireita();
                case 8 -> funcionalidades.verificarVelocidade();
                case 0 -> System.out.println("Encerrando programa do carro...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
