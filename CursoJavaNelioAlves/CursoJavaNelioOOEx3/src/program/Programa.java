package program;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = input.nextLine();
        aluno.nota1 = input.nextDouble();
        aluno.nota2 = input.nextDouble();
        aluno.nota3 = input.nextDouble();

        double finalGrade = aluno.finalGrade();

        if (finalGrade >= 60.0) {
            System.out.println("FINAL GRADE = " + finalGrade);
            System.out.println("PASS");
        } else {
            System.out.println("FINAL GRADE = " + finalGrade);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.0 - finalGrade);
        }
    }
}
