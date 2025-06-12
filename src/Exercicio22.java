//22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de B");
        int b = teclado.nextInt();
        int quociente = a / b;
        int resto = a % b;
        System.out.println("O quociente é: " + quociente + " o resto é " + resto);


    }
}
