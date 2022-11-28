
package com.mycompany.finalgrade;

public class Student {
    private String name;
    private double note1, note2, note3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }
    
    public void viewFinalGrade() {
      
        double finalGrade = (this.note1 * 0.30) + (this.note2 * 0.35) +(this.note3 * 0.35);
        if(finalGrade >= 60.00){
            System.out.println("Final Grade =" + finalGrade);
            System.out.println("Pass");
        }
        else{
            System.out.println("Final Grade = " + finalGrade);
            System.out.println("Failed");
            finalGrade = finalGrade - 60;
            System.out.println("Missing:" + finalGrade + "Points");
        }
    }
}
