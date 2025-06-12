import java.util.Scanner;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
public class Exercicio5 {
    public static void main(String[] args) {
        double salarioMinimo = 1293.20;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario do usuario");
        double salarioUsuario = teclado.nextDouble();
        double totalSalarios = salarioUsuario / salarioMinimo;
        String numeroFormatado = String.format("%.2f", totalSalarios);
        System.out.println("O usuario recebe até " + numeroFormatado + " salarios minimos");

    }
}
