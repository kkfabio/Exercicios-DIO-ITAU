package Exercicio3POO;

public class MaquinaDePets {
    private int nivelAgua;
    private int nivelShampoo;
    private Pet petNaMaquina;

    public MaquinaDePets() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.petNaMaquina = null;
    }

    public void abastecerAgua() {
        if (nivelAgua + 2 <= 30) {
            nivelAgua += 2;
            System.out.println("Abastecido com 2 litros de água. Nível atual: " + nivelAgua);
        } else {
            System.out.println("Capacidade máxima de água atingida.");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + 2 <= 10) {
            nivelShampoo += 2;
            System.out.println("Abastecido com 2 litros de shampoo. Nível atual: " + nivelShampoo);
        } else {
            System.out.println("Capacidade máxima de shampoo atingida.");
        }
    }

    public void colocarPet(Pet pet) {
        if (petNaMaquina == null) {
            petNaMaquina = pet;
            System.out.println("Pet " + pet.getNome() + " colocado na máquina.");
        } else {
            System.out.println("Já existe um pet na máquina.");
        }
    }

    public void retirarPet() {
        if (petNaMaquina != null) {
            System.out.println("Retirando pet " + petNaMaquina.getNome() + " da máquina.");
            if (!petNaMaquina.isLimpo()) {
                System.out.println("Pet saiu sujo. É necessário limpar a máquina.");
            }
            petNaMaquina = null;
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void darBanho() {
        if (petNaMaquina == null) {
            System.out.println("Não há pet na máquina.");
            return;
        }
        if (nivelAgua >= 10 && nivelShampoo >= 2) {
            nivelAgua -= 10;
            nivelShampoo -= 2;
            petNaMaquina.setLimpo(true);
            System.out.println("Banho realizado no pet " + petNaMaquina.getNome() + ".");
        } else {
            System.out.println("Níveis insuficientes de água ou shampoo.");
        }
    }

    public void limparMaquina() {
        if (nivelAgua >= 3 && nivelShampoo >= 1) {
            nivelAgua -= 3;
            nivelShampoo -= 1;
            System.out.println("Máquina limpa com sucesso.");
        } else {
            System.out.println("Níveis insuficientes para limpeza.");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua + " litros.");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo + " litros.");
    }

    public void verificarPetNaMaquina() {
        if (petNaMaquina != null) {
            System.out.println("Pet " + petNaMaquina.getNome() + " está na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }
}
