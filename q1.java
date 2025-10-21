import java.util.Scanner;
// Importa o comando "Scanner" para que seja possível inserir as informações

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Aqui está sendo criado o comando usado para que o usuário digite sua resposta

        System.out.print("Digite um número: ");
        // Primeiro eu digito uma mensagem para o usuário para dizer o que ele precisa fazer
        int num = input.nextInt();
        // Depois eu utilizo o comando que criei anteriormente (input) para que o usuário digite sua resposta. Note que antes do comando em si está sendo declarada o tipo da variável (int)

        if (num >= 10 && num <= 50) {
        // Aqui eu estou definindo a condição para que o computador cheque se o número digitado está entre 10 e 50
            System.out.println("O número " + num + " está entre 10 e 50.");
            if (num % 2 == 0) {
            // Este if define se o número digitado é par ou ímpar
                System.out.println("Além disso, o número " + num + " é um número par.");
            } else {
                System.out.println("Além disso, o número " + num + " é um número ímpar.");
            }
        }
        else {
        // Caso não entre no if, eu decidi que a operação seja a mesma, mas que diga que não está entre 10 e 50
            System.out.println("O número " + num + " não está entre 10 e 50.");
            if (num % 2 == 0) {
                // Este if define se o número digitado é par ou ímpar
                System.out.println("Além disso, o número " + num + " é um número par.");
            } else {
                System.out.println("Além disso, o número " + num + " é um número ímpar.");
            }
        }
    }
}