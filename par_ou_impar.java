import java.util.Scanner;

public class par_ou_impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("O número " + num + " é par.");
        }
        else{
            System.out.println("O número " + num + " é ímpar.");
        }
    }
}