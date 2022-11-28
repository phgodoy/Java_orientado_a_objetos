
package classes;

import interfaces.Payments;

public abstract class Employee implements Payments{
    private String name;
    private String lastName;
    private Double CPF;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCPF() {
        return CPF;
    }

    public void setCPF(Double CPF) {
        this.CPF = CPF;
    }
    
    public abstract double receiveSalary(double salarry);
    
    
}
