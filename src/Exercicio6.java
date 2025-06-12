//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um valor");
        double valor = teclado.nextDouble();
        double valorReajuste = valor + (valor * 0.05);
        System.out.println("%.2f" + valorReajuste);
    }

}
