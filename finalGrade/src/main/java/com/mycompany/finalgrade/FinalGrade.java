

package com.mycompany.finalgrade;

import java.util.Scanner;


public class FinalGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        Student student = new Student();
        System.out.println("Informe o nome do aluno:");
        student.setName(sc.next());
        System.out.println("Informea primeira nota do aluno:");
        student.setNote1(sc.nextDouble());
        System.out.println("Informe a segunda nota do aluno:");
        student.setNote1(sc.nextDouble());
        System.out.println("Informe a terceira nota do aluno:");
        student.setNote1(sc.nextDouble());
        
        student.viewFinalGrade();
    }
}
