import java.util.Scanner;

//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual tabuada você deseja?");
        int numero = teclado.nextInt();
        if(numero <=10){
            for (int i = 1; i <=10 ; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
            }
        }
    }
}
