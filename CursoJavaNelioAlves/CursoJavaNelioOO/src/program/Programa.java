package program;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numeroTabuada = input.nextInt();
        int contador = 0;

        while (contador <= 10) {
            System.out.printf("%d x %d = %d\n", numeroTabuada, contador, numeroTabuada * contador);
            contador ++;
        }
    }
}
