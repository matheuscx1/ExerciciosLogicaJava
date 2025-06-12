//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = teclado.nextInt();
        if(numero % 2 == 0){
            System.out.println("O numero é par ");
        }else{
            System.out.println("O numero é impar");
        }

        if(numero > 0){
            System.out.println("é positivo");
        }else {
            System.out.println("é negativo");
        }

    }
}

//Em contexto de exercícios de lógica e algoritmos, “receber” quase sempre significa que o programa deve aceitar um valor de fora — ou seja, do usuário.
//São duas análises diferentes, então precisa de dois blocos if/else um para cada coisa