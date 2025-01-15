
package com.mycompany.one.to.many;


public class Student {
    
    private int stdId,g1,g2,g3;
    private String stdName;
    
    
    
    public Student() {
    }

    
    public Student(int stdId, int g1, int g2, int g3, String stdName) {
        this.stdId = stdId;
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        this.stdName = stdName;
    }
    //method to finde the avareg-----------------------------------------
    public double findAv(){
        return (getG1()+getG2()+getG3())/3;
    }

    @Override
    public String toString() {
        return"student name: "+getStdName()+"\nstudent id: "+getStdId()+"\ngrades: "+getG1()+" "+getG2()+" "+getG3(); 
    }

    
    public int getStdId() {
        return stdId;
    }

    
    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    
    public int getG1() {
        return g1;
    }

    
    public void setG1(int g1) {
        this.g1 = g1;
    }

    
    public int getG2() {
        return g2;
    }

    
    public void setG2(int g2) {
        this.g2 = g2;
    }

    
    public int getG3() {
        return g3;
    }

    
    public void setG3(int g3) {
        this.g3 = g3;
    }

    
    public String getStdName() {
        return stdName;
    }

    
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
    
}
    
