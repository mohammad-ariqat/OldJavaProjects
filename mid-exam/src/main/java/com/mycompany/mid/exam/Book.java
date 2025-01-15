
package com.mycompany.mid.exam;


public class Book {
    
    
    private String isbn;
    
    private String name;
    
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String isbn, String name, Author author, double price,int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty=qty;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", name=" + name + ", author=" + author.toString() + ", price=" + price + ", qty=" + qty + '}';
    }
    
    
    

    /**
     * @return the ISBN
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName (){
        
        return author.getName();
    }
}
