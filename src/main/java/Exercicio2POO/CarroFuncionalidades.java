package Exercicio2POO;

public class CarroFuncionalidades {
    private Carro carro;

    public CarroFuncionalidades(Carro carro) {
        this.carro = carro;
    }

    public void ligar() {
        if (!carro.isLigado()) {
            carro.setLigado(true);
            System.out.println("Carro ligado.");
        } else {
            System.out.println("Carro já está ligado.");
        }

    }

    public void desligar() {
        if (carro.isLigado() && carro.getMarcha() == 0 && carro.getVelocidade() == 0) {
            carro.setLigado(false);
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro agora.");
        }
    }

    public void acelerar() {
        if (!carro.isLigado()) {
            System.out.println("Carro desligado não pode acelerar.");
            return;
        }
        if (carro.getMarcha() == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }
        int novaVelocidade = carro.getVelocidade() + 1;
        if (novaVelocidade <= 120 && dentroDoLimite(novaVelocidade, carro.getMarcha())) {
            carro.setVelocidade(novaVelocidade);
            System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
        } else {
            System.out.println("Velocidade não permitida para esta marcha.");
        }

    }

    public void diminuirVelocidade() {
        if (!carro.isLigado()) {
            System.out.println("Carro desligado não pode reduzir velocidade.");
            return;
        }
        int novaVelocidade = carro.getVelocidade() - 1;
        if (novaVelocidade >= 0 && dentroDoLimite(novaVelocidade, carro.getMarcha())) {
            carro.setVelocidade(novaVelocidade);
            System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
        } else {
            System.out.println("Velocidade não permitida para esta marcha.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!carro.isLigado()) {
            System.out.println("Carro desligado não pode trocar marcha.");
            return;
        }
        if (novaMarcha == carro.getMarcha() + 1 || novaMarcha == carro.getMarcha() - 1) {
            if (novaMarcha >= 0 && novaMarcha <= 6) {
                carro.setMarcha(novaMarcha);
                System.out.println("Marcha atual: " + carro.getMarcha());
            }
        } else {
            System.out.println("Não é permitido pular marchas.");
        }
    }

    public void virarEsquerda() {
        if (carro.getVelocidade() >= 1 && carro.getVelocidade() <= 40) {
            System.out.println("Virando para a esquerda...");
        } else {
            System.out.println("Não é possível virar nesta velocidade.");
        }
    }

    public void virarDireita() {
        if (carro.getVelocidade() >= 1 && carro.getVelocidade() <= 40) {
            System.out.println("Virando para a direita...");
        } else {
            System.out.println("Não é possível virar nesta velocidade.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
    }

    private boolean dentroDoLimite(int velocidade, int marcha) {
        return switch (marcha) {
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };



    }
}

