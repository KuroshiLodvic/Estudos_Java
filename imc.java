import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Digite seu peso: ");
        peso = input.nextDouble();

        System.out.println("Digite sua altura (em metros): ");
        altura = input.nextDouble();

        input.close();

        imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5){
            System.out.println("Você está abaixo do peso.");
        }
        else if (imc <= 24.9){
            System.out.println("Você está com o peso ideal.");
        }
        else if (imc <= 29.9){
            System.out.println("Você está acima do peso.");
        }
        else if (imc >= 30){
            System.out.println("Você está obeso.");
        }
    }
}
