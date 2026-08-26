    import java.util.Scanner;

    public class Exercicio6 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            int num1 = sc.nextInt();

            System.out.println("Digite outro numero:\n(Esse número deve ser maior que o primeiro!)");
            int num2 = sc.nextInt();

            System.out.println("Você quer ver todos os números pares, ou ímpares? ");
            String opcao = sc.next();

            if (opcao.equalsIgnoreCase("pares")){
                for (int i = num2; i >= num1; i--) {
                    if (i % 2 == 0){
                        System.out.println(i);
                    }
                }
            }

            if (opcao.equalsIgnoreCase("impares")){
                for (int i = num2; i >= num1; i--){
                    if (i % 2 != 0){
                        System.out.println(i);
                    }
                }
            }


        }
    }
