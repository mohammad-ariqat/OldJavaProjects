
package com.mycompany.oopassignment3;

public class OopAssignment3 {

    public static void main(String[] args) {
        Student str=new Student();
        
        str.insertInfo();
        str.findAv(str.grad1,str.grad2,str.grad3);
        str.printStudentInfo();
        System.out.println("pass?: "+str.findResult(str.studAv));
        str.printNameAv();
        System.out.println("is Email? "+str.checEmail(str.studEmail));
    }
}
