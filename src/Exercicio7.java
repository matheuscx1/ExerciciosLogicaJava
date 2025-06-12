//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        boolean valorA;
        boolean valorB;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        valorA = teclado.nextBoolean();
        System.out.println("Digite o valor de B");
        valorB = teclado.nextBoolean();
        if(valorA == valorB){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }



    }

}
