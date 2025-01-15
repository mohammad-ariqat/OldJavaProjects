
package com.mycompany.one.to.many;

import java.util.Scanner;



public abstract class dept {
    
    Scanner in =new Scanner(System.in);
    
    private int dptNum;
    String deptName;

    
    
    public dept() {
    }

    public dept(int dptNum, String deptName) {
        this.dptNum = dptNum;
        this.deptName = deptName;
    }
    
    
    //method to print the dept info---------------------------------------
    public void deptinfo(){
        System.out.println("the dept number is "+dptNum);
        
        System.out.println("the dept name is "+deptName);
    }
    
    //-------------seters and geters--------------------------------------
    public int getDptNum() {
        return dptNum;
    }

    
    public void setDptNum(int dptNum) {
        while (dptNum==0) {            
            System.out.println("dpt number cant be 0");
            dptNum=in.nextInt();
        }
        this.dptNum = dptNum;    
           
    }

    
    public String getDeptName() {
        return deptName;
    }

    
    public abstract void setDeptName(String deptName) ;
               
    
    

}
