
package com.mycompany.inheratance;

import java.util.Date;
import java.util.Scanner;

public class Employee extends person{
    sons[]so=new sons[3];
    double salary;
    String position;
    int empno;
    
    public Employee() {
    }
  
    public double findTax(double tax){
        if (salary<=1000) {
            tax=0;
            return tax;
        }
        if (1000<salary && salary<=3000) {
            tax=salary*5/100;
            return tax;
        }
        if (300<salary && salary<=5000) {
            return salary*10/100;
        }
        return 0;
    }
    public void readEmp(){
        Scanner in=new Scanner (System.in);
        
         System.out.println("enter the name"); super.name=in.next();
        
        System.out.println("enter the id"); super.id=in.nextInt();
        
        System.out.println("enter the tel"); super.tel=in.nextInt();
        
        System.out.println("enter dob");
        System.out.println("enter the date"); super.dob = new Date();
        
        
        
        System.out.println("enter emp nom"); empno=in.nextInt();
        
        System.out.println("enter position"); position=in.next();
        
        System.out.println("enter salary"); salary=in.nextDouble();
        for (int i = 0; i < 10; i++) {
        System.out.println("enter name of son"+so[i]);so[i].name=in.next();
        
        so[i].dob.getDate();
        
        
        }
        
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", position=" + position + ", empno=" + empno + '}';
    }
    
}       
