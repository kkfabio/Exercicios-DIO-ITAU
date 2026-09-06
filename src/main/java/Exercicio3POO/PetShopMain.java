package Exercicio3POO;

import java.util.Scanner;

public class PetShopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaDePets maquina = new MaquinaDePets();

        int opcao;
        do {
            System.out.println("\n========= MENU PETSHOP =========");
            System.out.println("1 - Abastecer água");
            System.out.println("2 - Abastecer shampoo");
            System.out.println("3 - Colocar pet na máquina");
            System.out.println("4 - Retirar pet da máquina");
            System.out.println("5 - Dar banho no pet");
            System.out.println("6 - Limpar máquina");
            System.out.println("7 - Verificar nível de água");
            System.out.println("8 - Verificar nível de shampoo");
            System.out.println("9 - Verificar se há pet na máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> maquina.abastecerAgua();
                case 2 -> maquina.abastecerShampoo();
                case 3 -> {
                    System.out.print("Digite o nome do pet: ");
                    String nome = scanner.next();
                    Pet pet = new Pet(nome);
                    maquina.colocarPet(pet);
                }
                case 4 -> maquina.retirarPet();
                case 5 -> maquina.darBanho();
                case 6 -> maquina.limparMaquina();
                case 7 -> maquina.verificarNivelAgua();
                case 8 -> maquina.verificarNivelShampoo();
                case 9 -> maquina.verificarPetNaMaquina();
                case 0 -> System.out.println("Encerrando programa do petshop...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
