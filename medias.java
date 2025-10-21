import java.util.Scanner;

public class medias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a média final: ");
        double nota_final = input.nextDouble();

        String conceito;

        if (nota_final >= 0 && nota_final <= 4){
            System.out.println("O aluno está reprovado.");
            conceito = "R";
        }
        else if (nota_final >= 5 && nota_final <= 6 ){
            System.out.println("O aluno está de recuperação");
            conceito = "RC";
        }
        else if (nota_final >= 7 && nota_final <= 10){
            System.out.println("O aluno está aprovado.");
            conceito = "A";
        }
        else {
            System.out.println("Média inválida! Digite um número entre 0 e 10.");
            conceito = "";
        }

        switch(conceito){
            case "R":
                System.out.println("Precisa se dedicar mais.");
                break;
            case "RC":
                System.out.println("Ainda há chance. Revise o conteúdo.");
                break;
            case "A":
                System.out.println("Parabéns pelo bom desempenho!");
                break;
            default:
                System.out.println("Não foi possível determinar a mensagem.");
                break;
        }
    }
}
