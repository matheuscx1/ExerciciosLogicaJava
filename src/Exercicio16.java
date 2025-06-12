//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor A");
        int valorA = teclado.nextInt();
        System.out.println("Digite o valor B");
        int valorB = teclado.nextInt();
        System.out.println("Digite o valor de C");
        int valorC = teclado.nextInt();
        if(valorA + valorB > valorC && valorA + valorC > valorB && valorB + valorC > valorA){
            if(valorA == valorB && valorB == valorC){
                System.out.println("Equilatero");
            }else if(valorA == valorB || valorA == valorC || valorB == valorC){
                System.out.println("Isoceles");
            }else{
                System.out.println("Escaleno");
            }
            }

    }
}
