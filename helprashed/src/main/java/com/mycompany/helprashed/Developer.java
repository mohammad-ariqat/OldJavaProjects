
package com.mycompany.helprashed;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;


public class Developer {
    ArrayList<Student> students = new ArrayList<>();
    private String name;
    private char degree;
    private int eYears;

     public Developer() {
        this.name = "moha";
        this.degree = 'S';
        this.eYears = 5;
    }
     
    public Developer(String name, char degree, int eYears) {
        setName(name);
        setDegree(degree);
        seteYears(eYears);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getDegree() {
        return degree;
    }

    public void setDegree(char degree) {
        if (degree == 'j' || degree == 's' ) {
            this.degree = degree;
        }else {
            System.out.println("not allowed value it has to be j or s");
        }
        
    }

    public int geteYears() {
        return eYears;
    }

    public void seteYears(int eYears) {
        if (eYears >=0 && eYears <=50) {
            this.eYears = eYears;
        }else{
           System.out.println("not allowed value it has");
        }
        
    }

   public double getYearsAllownce (){
       double Allowence = 0;
       
       if (eYears >=0 && eYears <=10) {
            Allowence = eYears * 10;
            return Allowence;
        }
       else if(eYears >10 && eYears <=20){
          Allowence = eYears * 30;
            return Allowence;
        }
       else if(eYears >20){
          Allowence = eYears * 50;
            return Allowence;
        }
       return Allowence;
       
    
  
               
   }
    public  double getDegreeAllowance (){
        double DegreeAllowance = 0;
        switch (degree) {
            case 'j':
                DegreeAllowance = 400; 
                break;
            case 's':
                DegreeAllowance = 800;
                break;
            default:
                return DegreeAllowance;
        }
        return DegreeAllowance;
    
    }
    
   public double getSalary(){
    double salary = 0;
    
    salary = getYearsAllownce() + getDegreeAllowance() + 150;
    
    return salary;
   }

    @Override
    public String toString() {
        return "Developer{" + "name=" + name + ", degree=" + degree + ", eYears=" + eYears + "years allowence =" + getYearsAllownce() + '}';
    }
}
