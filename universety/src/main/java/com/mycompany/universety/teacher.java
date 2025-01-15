
package com.mycompany.universety;

import java.util.Scanner;


public class teacher {
    int tchId;
    String tchName;
    int salary;
    student [] std=new student [2];
    student st;

    public teacher() {
    
    
    }
    
    public teacher(int tchId, String tchName, int salary) {
        this.tchId = tchId;
        this.tchName = tchName;
        this.salary = salary;
    }
    public void fillInfo (){Scanner x=new Scanner(System.in);
        System.out.println("enter teacher name");
        tchName=x.next();
        System.out.println("enter teacher ID");
        tchId=x.nextInt();
        System.out.println("enter teacher salary");
        salary=x.nextInt();
        
        for (int i = 0; i < std.length; i++) {
            System.out.println("enter info of student "+(i+1)+" ID,NAME,AV");
            std[i]=new student(x.nextInt(),x.next(),x.nextDouble());
        }
    }
    
    public void printTeacher (){
        System.out.println("---------tch info--------------");
        System.out.println("the techer name is "+tchName);
        System.out.println("the techer id is "+tchId);
        System.out.println("the techer salary is "+salary);
    }
    public void printStudent(){
        for (int i = 0; i < std.length; i++) {
            System.out.println("---------std "+i+" info----------");
            System.out.println("the student name is "+std[i].stdName);
            System.out.println("the student id is "+std[i].stdId);
            System.out.println("the student avareg is "+std[i].Av);   
        }
    }
    
}
