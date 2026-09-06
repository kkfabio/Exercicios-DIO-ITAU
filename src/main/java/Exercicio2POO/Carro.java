package Exercicio2POO;

public class Carro {
        private boolean ligado;
        private int velocidade;
        private int marcha;

        public Carro() {
            this.ligado = false;
            this.velocidade = 0;
            this.marcha = 0;
        }

        public boolean isLigado() {
            return ligado;
        }

        public int getVelocidade() {
            return velocidade;
        }

        public int getMarcha() {
            return marcha;
        }

        public void setLigado(boolean ligado) {
            this.ligado = ligado;
        }

        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }

        public void setMarcha(int marcha) {
            this.marcha = marcha;
        }
    }

