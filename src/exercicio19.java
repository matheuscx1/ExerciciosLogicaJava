//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class exercicio19 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                int x = i * j;
                System.out.println(i + " x " + j + " = " + x);
            }
        }
    }
}
