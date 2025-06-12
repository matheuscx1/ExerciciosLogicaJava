//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        double temperaturaF = teclado.nextDouble();
        double temperaturaC = (temperaturaF - 32) / 1.8;
        System.out.println("temperatura em Fahrenheit: " + temperaturaF);
        System.out.println("Temperatura em celsius " + temperaturaC);
    }
}
