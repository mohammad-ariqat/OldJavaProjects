

package com.mycompany.examm;

import java.util.Scanner;


public class Examm {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Book [] books =new Book [5];
        
        for (int i = 0; i < books.length; i++) {
            
            books[i] =new Book();
            System.out.println("book "+i+" info");
            
            System.out.println("enter book title");books[i].setBookTitle(s.next());
            
            System.out.println("enter book number");books[i].setBookNo(s.nextInt());
            
            System.out.println("enter book topic");books[i].setBookTopic(s.next());
            
            System.out.println("enter book price");books[i].setBookPrice(s.nextInt());
            
        }
        
        for (int i = 0; i < books.length; i++) {
            System.out.println("data of book number "+(i+1));
            
            books[i].printAllData();
        }
        
        
        int total=0;
        for (int i = 0; i < books.length; i++) {
            
                
            books[i].totalPrice(books[i].getBookPrice());
                
                
            
        }
        System.out.println("the total is "+total);
        
       
    }
    
}
