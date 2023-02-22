package program;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        retangulo.width = input.nextDouble();
        retangulo.height = input.nextDouble();

        System.out.println(retangulo);
    }
}