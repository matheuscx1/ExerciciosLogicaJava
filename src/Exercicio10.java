//10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno");
        double nota1 = teclado.nextInt();
        System.out.println("Digite a segunda nota do aluno");
        double nota2 = teclado.nextInt();
        System.out.println("Digite a terceira nota do aluno");
        double nota3 = teclado.nextInt();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média é: %.2f\n", media);

    }
}
