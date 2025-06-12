//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite o primeiro valor");
        int valor1 = teclado.nextInt();
        numeros.add(valor1);
        System.out.println("Digite o segundo valor");
        int valor2 = teclado.nextInt();
        numeros.add(valor2);
        System.out.println("Digite o terceiro valor");
        int valor3 = teclado.nextInt();
        numeros.add(valor3);
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);
    }

}
