
package classes;


public class EmployeeBoss extends Employee{

    @Override
    public double receiveSalary(double salary) {
        System.out.println("Salario Pago:"+salary);
        return salary;
    }
}
