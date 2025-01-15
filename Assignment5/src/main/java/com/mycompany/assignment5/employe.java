
package com.mycompany.assignment5;


public class employe {
    int id;
    String name;
    Address address;

    public employe() {
    }
    
    public void display (){
        System.out.println("the name is "+name);
        System.out.println("the id is "+id);
        System.out.println("the addres: ");
        address.display();
    }
}
