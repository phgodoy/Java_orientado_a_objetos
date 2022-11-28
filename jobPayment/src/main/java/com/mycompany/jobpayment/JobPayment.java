
package com.mycompany.jobpayment;

import classes.EmployeeBoss;
import classes.EmployeeCommission;
import java.util.Scanner;


public class JobPayment {

    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);  
        

        while (true) {            

        System.out.print("##--Estrutura de Menu--##\n\n");
        System.out.print("|---------------------------------------------------------|\n");
        System.out.print("| Opção 1 - Realizar pagamento de um funcionario-chefe |\n");
        System.out.print("| Opção 2 - Realizar pagamento de um funcionario-comissionado|\n");
        System.out.print("| Opção 3 - Sair              |\n");
        System.out.print("|---------------------------------------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();

        switch (opcao) {
            case 1 -> {
                EmployeeBoss employeeBoss = new EmployeeBoss();
                System.out.println("Informe o nome do funcionario:");
                employeeBoss.setName(menu.next());
                System.out.println("Informe o sobrenome do funcionario:");
                employeeBoss.setLastName(menu.next());
                System.out.println("Informe o CPF do funcionario:");
                employeeBoss.setCPF(menu.nextDouble());
                System.out.println("Informe o salario funcionario:");
                double salary = employeeBoss.receiveSalary(menu.nextDouble());
                System.out.println("Salario pago para:"+employeeBoss.getName()+employeeBoss.getLastName());
                System.out.println("R$"+salary);
                break;
                }

            case 2 -> {
                EmployeeCommission employeeCommission  = new EmployeeCommission();
                System.out.println("Informe o nome do funcionario:");
                employeeCommission.setName(menu.next());
                System.out.println("Informe o sobrenome do funcionario:");
                employeeCommission.setLastName(menu.next());
                System.out.println("Informe o CPF do funcionario:");
                employeeCommission.setCPF(menu.nextDouble());
                System.out.println("Informe o salario funcionario:");
                double salary = employeeCommission.receiveSalary(menu.nextDouble());
                System.out.println("Salario pago para:"+employeeCommission.getName()+employeeCommission.getLastName());
                System.out.println("R$"+salary);
                break;
               }

            case 3 -> {
                System.out.print("\nAté logo!");
                menu.close();
                 }

            default -> System.out.print("\nOpção Inválida!");
            }
        }
    }
}