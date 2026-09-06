package Exercicio1POO;

public class ContaBancaria {
    private double saldo;
    private double limiteEspecial;
    private double chequeEspecialUtilizado;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeEspecialUtilizado = 0;

        if (depositoInicial <= 500) {
            this.limiteEspecial = 50;
        } else {
            this.limiteEspecial = depositoInicial * 0.5;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return limiteEspecial - chequeEspecialUtilizado;
    }

    public double consultarChequeEspecialUtilizado() {
        return chequeEspecialUtilizado;
    }

    public void depositar(double valor) {
        if (chequeEspecialUtilizado > 0) {
            double taxa = chequeEspecialUtilizado * 0.2;
            saldo -= taxa;
            chequeEspecialUtilizado = 0;
        }
        saldo += valor;
    }

    public boolean sacar(double valor) {
        double totalDisponivel = saldo + (limiteEspecial - chequeEspecialUtilizado);

        if (valor > totalDisponivel) {
            return false;
        }

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            double necessitaEspecial = valor - saldo;
            saldo = 0;
            chequeEspecialUtilizado += necessitaEspecial;
        }

        return true;
    }

    public boolean pagarBoleto(double valor) {
        return sacar(valor);
    }

    public boolean estaUsandoChequeEspecial() {
        return chequeEspecialUtilizado > 0;
    }
}