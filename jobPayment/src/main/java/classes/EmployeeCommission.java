
package classes;


public class EmployeeCommission extends Employee{
    private double comission;
    private double rates = 0.03 , tax = 1000.00;
    private int sales;
    
    public double getComission() {
        return comission;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
    
    @Override
    public double receiveSalary(double salary) {
        comission = salary +(this.sales * this.rates);
        return comission;
    }
 
}
