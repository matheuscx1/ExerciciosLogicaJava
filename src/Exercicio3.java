//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de B");
        int b = teclado.nextInt();
        int soma = a + b;
        int multiplicacao = a * b;
        int c = 0;
        if(a == b){
            c = soma;
            System.out.println(c);
        }else{
            c = multiplicacao;
            System.out.println(c);
        }
    }
}
