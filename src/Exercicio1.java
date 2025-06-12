
//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

//🧠 O que o algoritmo precisa fazer?
//Vamos quebrar em etapas lógicas:
//Ler três valores (A, B e C) — dados de entrada. (Scanner para ler)
//Somar A + B — processamento.
//Mostrar o resultado da soma — saída.
//Verificar se a soma é menor que C — condição (decisão). (If e else)
//Mostrar uma mensagem com base na comparação — saída condicional.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de B");
        int b = teclado.nextInt();
        System.out.println("Digite o valor de C");
        int c = teclado.nextInt();
        int soma = a + b;
        System.out.println("A soma de A e B são " + soma);
        if(soma < c){
            System.out.println("A soma de A e B é menor que C");
        }else {
            System.out.println("A soma de A e B não são maior que C");
        }

    }
}