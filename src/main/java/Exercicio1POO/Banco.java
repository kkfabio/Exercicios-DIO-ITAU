package Exercicio1POO;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo inicial para abrir a conta: R$ ");
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        int opcao;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Consultar Dados da Conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar Boleto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("-- DADOS DA CONTA --");
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    System.out.println("Cheque especial disponível: R$ " + conta.consultarChequeEspecial());
                    System.out.println("Cheque especial utilizado: R$ " + conta.consultarChequeEspecialUtilizado());
                    System.out.println("Está usando cheque especial? " + (conta.estaUsandoChequeEspecial() ? "Sim" : "Não"));
                    break;

                case 2:
                    System.out.print("Digite o valor que deseja sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    boolean sacou = conta.sacar(valorSaque);
                    if (sacou) {
                        System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
                    } else {
                        System.out.println("Operação negada! Saldo e limite insuficientes.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor que deseja depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito de R$ " + valorDeposito + " processado!");
                    break;

                case 4:
                    System.out.print("Digite o valor do boleto: R$ ");
                    double valorBoleto = scanner.nextDouble();
                    boolean pagou = conta.pagarBoleto(valorBoleto);
                    if (pagou) {
                        System.out.println("Boleto de R$ " + valorBoleto + " pago com sucesso!");
                    } else {
                        System.out.println("Operação negada! Saldo e limite insuficientes para pagar o boleto.");
                    }
                    break;

                case 0:
                    System.out.println("Finalizando o programa. Obrigado por utilizar nossos serviços!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida do menu.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}