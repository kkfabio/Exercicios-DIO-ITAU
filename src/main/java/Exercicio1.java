import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o ano do seu nascimento: ");
        int yearNasc = sc.nextInt();

        int calcIdade = OffsetDateTime.now().getYear() - yearNasc;

        System.out.printf("Olá %s, você tem %s anos", nome, calcIdade );


    }

}
