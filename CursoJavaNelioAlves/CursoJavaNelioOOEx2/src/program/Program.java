package program;

import entities.Employee;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Digite o nome do funcionário: ");
        employee.name = input.nextLine();
        System.out.print("Digite o salário bruto do funcionário: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Digite a taxa de imposto do funcionário: ");
        employee.tax = input.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(input.nextDouble());

        System.out.printf("Update data: %s, $ %.2f", employee.name, employee.netSalary());
    }
}
