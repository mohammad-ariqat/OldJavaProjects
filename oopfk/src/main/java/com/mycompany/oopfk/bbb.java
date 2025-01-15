
package com.mycompany.oopfk;


public class bbb {
 // - num   
  
private int num;
private  String name;
private int id;
private double grad;

    public bbb() {
  
    }
    public bbb(int num,String name ){
    
    
    }

    public bbb(int num, String name, int id, double grad) {
       this(num,name);
        this.id = id;
        this.grad = grad;
    }
    

   
public void setNum(int num){

this.num=num;
}
public int getNum(){

return num;
        }

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the grad
     */
    public double getGrad() {
        return grad;
    }

    /**
     * @param grad the grad to set
     */
    public void setGrad(double grad) {
        this.grad = grad;
    }
}
