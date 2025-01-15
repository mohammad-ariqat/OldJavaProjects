
package com.mycompany.qizz;

import java.util.Scanner;


public class class1 {
    Scanner s =new Scanner(System.in);
    private int calssId;
    
    private String className;
    
    private double price;
    
    private String subject;

    public class1() {
    }
    
    
    public void read5Calsses (){
        
    }
    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        while (!subject.equals("Inheritance") && !subject.equals("overrideing") && !subject.equals("encapsulation") && !subject.equals("overloading")) {
            System.out.println("subject must be Inheritance or overrideing or encapsulation or overloading"); subject =s.next();
            
            
        }
        this.subject = subject;
    }
    
    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        if (subject .equals("Inheritance")){
           this.className="set and get class";
           
        }
        if (subject .equals("overrideing" )|| subject .equals("overloading")){
           this.className="polymore class";
           
        }
        if (subject .equals("encapsulation") ){
           this.className="sub supe rclass";
           
        }
    }

    /**
     * @return the calssId
     */
    public int getCalssId() {
        return calssId;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param calssId the calssId to set
     */
    public void setCalssId(int calssId) {
        this.calssId = calssId;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    
}
