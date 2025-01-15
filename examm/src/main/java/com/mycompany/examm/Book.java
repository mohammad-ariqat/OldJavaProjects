
package com.mycompany.examm;

import java.util.Scanner;


public class Book {
    
    Scanner in =new Scanner(System.in);
    
    //-------------------------------------------------------------
    private int bookNo;
   static  private int bookPrice;
    private String bookTitle;
    private String bookTopic;

   //-------------------------------------------------------------
    public Book() {
    }
   
    public Book(int bookNo, int bookPrice, String bookTitle, String bookTopic) {
        this.bookNo = bookNo;
        this.bookPrice = bookPrice;
        this.bookTitle = bookTitle;
        this.bookTopic = bookTopic;
    }

    //method to print all data------------------------------
    public void printAllData (){
        
        System.out.println("the book number is "+getBookNo());
        
        System.out.println("the book title is "+getBookTitle());
        
        System.out.println("the book price is "+getBookPrice());
        
        System.out.println("the book topic is "+getBookTopic());
        
    }
    //to sting---------------------------------------------
    @Override
    public String toString() {
        return "Book{" + "in=" + in + ", bookNo=" + bookNo + ", bookPrice=" + bookPrice + ", bookTitle=" + bookTitle + ", bookTopic=" + bookTopic + '}';
    }
    
    //--------------------gets /sets-----------------------------
    public int getBookNo() {
        return bookNo;
    }

    
    public int getBookPrice() {
        return bookPrice;
    }

    
    public String getBookTitle() {
        return bookTitle;
    }

    
    public String getBookTopic() {
        
        return bookTopic;
    }

    
    public void setBookNo(int bookNo) {
        while (bookNo <=0) {            
            System.out.println("book number nust be >0");
            bookNo=in.nextInt();
        }
        
        this.bookNo = bookNo;
    }

    
    public void setBookPrice(int bookPrice) {
        switch (bookTopic) {
            case "S":bookPrice+=10;break;
            
            case "C":bookPrice-=5;break;
            
            case "A":bookPrice+=7;break;
            default:
                
        }
        this.bookPrice = bookPrice;
    }

    
    public void setBookTitle(String bookTitle) {
        while (bookTitle.isBlank()) {            
            System.out.println("book Title must be entered");
            bookTitle=in.next();
        }
        this.bookTitle = bookTitle;
    }

    
    public void setBookTopic(String bookTopic) {
        while (!bookTopic.equals("S") && !bookTopic.equals("C") && !bookTopic.equals("A") ) {            
            System.out.println("book topic must be S or C or A");
            bookTopic=in.next();
        }
        this.bookTopic = bookTopic;
    }
  static int total =0;
    public static void totalPrice (int price ){
        
        total += price;
       
        System.out.println("the total is" +total);
    }
    
}
