import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variáveis
        int idade = 25;

        // Scanner - Ler dados
        Scanner sc = new Scanner(System.in);

        // Ler textos - nextLine()
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        // Ler double - nextDouble()
        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();

        // Ler int
        System.out.print("Digite sua idade: ");
        int idade4 = sc.nextInt(); // idade digitada pelo usuário

        // Condicionais - Tomar decisões
        if (idade > 25) {
            System.out.println("Você tem mais de 25 anos");
        } else if (idade < 18) {
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você tem entre 18 e 25 anos");
        }

        // Verificação de nota
        int nota1 = 5;

        if (nota1 > 6) {
            System.out.println("Você está aprovado");
        } else if (nota1 >= 4) {
            System.out.println("Você está de recuperação");
        } else {
            System.out.println("Você está reprovado");
        }

        // Verificação de idade digitada
        if (idade4 >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }


    }
}

