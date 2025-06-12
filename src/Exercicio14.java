//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.


import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A = " + a );
        System.out.println("B = "+ b);


    }
}
