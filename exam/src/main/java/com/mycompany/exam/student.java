
package com.mycompany.exam;

import java.util.Scanner;
public class student {
    Scanner input=new Scanner(System.in);
    

    private int stdId;
    private String stdName;
    private int [] grades=new int[5];
    private double stAv;
    
    
    public student() {
    }

    public student(int stdId, String stdName, double stAv) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stAv = stAv;
    }
    

    /**
     * @return the stdId
     */
    public int getStdId() {
        return stdId;
    }

    /**
     * @param stdId the stdId to set
     */
    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    /**
     * @return the stdName
     */
    public String getStdName() {
        return stdName;
    }

    /**
     * @param stdName the stdName to set
     */
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    /**
     * @return the grades
     */
    public int[] getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    /**
     * @return the stAv
     */
    public double getStAv() {
        return stAv;
    }

    
    public void setStAv(double stAv) {
        this.stAv = stAv;
    }
    
    public void readData (){
        System.out.println("enter stdId");
        stdId=input.nextInt();
        System.out.println("enter sudent name");
        stdName=input.next();
        for (int i = 0; i < grades.length; i++) {
        System.out.println("enter grade "+(i+1));
        grades[i]=input.nextInt();
        
        
            
        }
    
}
        public double calAv(double sum){
            
            for (int i = 0; i < grades.length; i++) {
                sum+=grades[i];
                    
            }
            stAv=sum/grades.length;
       return stAv; }

    @Override
    public String toString() {
        
        return "student Id is "+stdId+"\nthe student name is "+stdName ; 
    }
        
        
        
    }
    
 

