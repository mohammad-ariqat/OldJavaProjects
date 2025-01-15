

package com.mycompany.one.to.many;


public class OneToMany {

    public static void main(String[] args) {
        Teacher tch=new Teacher();
        
        tch.fillinfo();
        tch.printTeacherAndStudents();
        tch.printTeacherAndDept();
        
    }
}
