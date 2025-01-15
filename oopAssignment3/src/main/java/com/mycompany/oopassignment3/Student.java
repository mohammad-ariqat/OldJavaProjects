
package com.mycompany.oopassignment3;
import java.util.Scanner;


public class Student {
    Scanner input =new Scanner(System.in);
    //student fields
    String studId,studNam,studEmail,tel;
    char gender;
    int grad1,grad2,grad3;
    double studAv;
    
    //constructor
    public Student(){
        
    }
    //--------------------------------------------------------------------------
    //method to print all student fields
     public void printStudentInfo(){
         System.out.println("student ID: "+studId);
         System.out.println("student Name: "+studNam);
         System.out.println("student Email: "+studEmail);
         System.out.println("student tel: "+tel);
         System.out.println("student Gender: "+gender);
         System.out.println("grad1: "+grad1+" grad2: "+grad2+" grad3: "+grad3);
         System.out.println("Avg: "+studAv);
     }
    //--------------------------------------------------------------------------
    //method to insert student information using scanner 
     public void insertInfo(){
         
         System.out.println("enter student ID");
         studId=input.next();
         
         System.out.println("enter student Name");
         studNam=input.next();
         
         System.out.println("enter student Email");
         studEmail=input.next();
         
         System.out.println("enter student tel");
         tel=input.next();
         
         System.out.println("enter student gender");
         gender=input.next().charAt(0);
         
         System.out.println("enter student grades");
         System.out.println("grade1:");grad1=input.nextInt();
         System.out.println("grade2:");grad2=input.nextInt();
         System.out.println("grade3:");grad3=input.nextInt();
     }
     //-------------------------------------------------------------------------
     //method to find the Av by passing the 3 grads and return Av
     public double findAv(int grad1,int grad2,int grad3){
         
         studAv=(grad1+grad2+grad3)/3;
         
         return studAv;
     }
     //-------------------------------------------------------------------------
     //method to find the result
     public boolean findResult(double studAv){
         
         if (studAv>=50) {
             return true;
         }
         else
             return false;
     }
     //-------------------------------------------------------------------------
     //method to print student name in Upper case and the Av
     public void printNameAv(){
         
         System.out.println("student name: "+studNam.toUpperCase());
         
         System.out.println("avg: "+studAv);
     }
     //-------------------------------------------------------------------------
     //method to check if the student Email is correct
     public boolean checEmail(String studEmail){             

         if(studEmail.endsWith("@std-zuj.edu.jo")){
             return true;
         }
         else
             return false;
     }
     //-------------------------------------------------------------------------
}
