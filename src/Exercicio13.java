//13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = teclado.next();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        if(idade >= 18){
            System.out.println(nome + " Tem " + idade + " e é de maior");
        }else{
            System.out.println(nome + " Tem " + idade + " e não é de maior");
        }
    }
}
