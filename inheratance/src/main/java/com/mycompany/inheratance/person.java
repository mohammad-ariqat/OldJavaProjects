
package com.mycompany.inheratance;

import java.util.Date;
import java.util.Scanner;


public class person {
    int id;
    String name;
    int tel;
    
    Date dob=new Date();
    
    public void readPerson(){
        Scanner in =new Scanner(System.in);
        
        System.out.println("enter the name"); name=in.next();
        
        System.out.println("enter the id"); id=in.nextInt();
        
        System.out.println("enter the tel"); tel=in.nextInt();
        
        System.out.println("enter dob");
        System.out.println("enter the date"); dob = new Date();
        
    }

    @Override
    public String toString() {
        return "person{" + "id=" + id + ", name=" + name + ", tel=" + tel + ", dob=" + dob + '}'+"date="+dob.getDate();
    }
    
    
}
