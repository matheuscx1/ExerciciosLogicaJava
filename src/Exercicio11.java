//11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String aluno = teclado.next();
        System.out.println("Digite a primeira nota de " + aluno);
        double nota1 = teclado.nextInt();
        System.out.println("Digite a segunda nota de " + aluno);
        double nota2 = teclado.nextInt();
        System.out.println("Digite a terceira nota de " + aluno);
        double nota3 = teclado.nextInt();
        System.out.println("Digite a quarta nota de " + aluno);
        double nota4 = teclado.nextInt();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A media de notas é: %.2f\n", media);
        if (media >= 7){
            System.out.println(aluno + " Aprovado ");
        }else{
            System.out.println("reprovado");
        }

    }
}
