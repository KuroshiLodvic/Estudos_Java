import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite o primeiro lado do triângulo: ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo lado do triângulo: ");
        n2 = input.nextInt();

        System.out.println("Digite o último lado do triângulo: ");
        n3 = input.nextInt();

        if (n1 + n2 > n3 && n2 + n3 > n1 && n1 + n3 > n2) {
            System.out.println(n1 + ", " + n2 + ", " + n3 + " formam um triângulo.");
            if (n1 != n2 && n1 != n3 && n2 != n3) {
                System.out.println("O triângulo formado é escaleno.");
            }
            else if (n1 == n2 && n2 == n3) {
                System.out.println("O triângulo formado é equilátero.");
            }
            else {
                System.out.println("O triângulo formado é isósceles.");
            }
        }
        else{
            System.out.println(n1 + ", " + n2 + ", " + n3 + " não formam um triângulo.");
        }
    }
}
