//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numeroAtual = teclado.nextInt();
        int sucessor = numeroAtual +1;
        int antecessor = numeroAtual -1;
        System.out.println(numeroAtual + " sucessor: " + sucessor + " antecessor: " + antecessor);


    }
}
