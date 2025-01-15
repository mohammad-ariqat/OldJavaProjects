
package com.mycompany.one.to.many;

import java.util.Scanner;


public class Teacher {
    Scanner in=new Scanner(System.in);
    dept dp=new dep();
    Student std[]=new Student[2];
    
    private int tchId;
    private String tchName;
    private double tchSal;
    
//--------------------------------method to fill info for all classes-----------
    public void fillinfo(){
        //---------------teacher fill info---------------------------
        
        System.out.println("enter teacher name");
        setTchName(in.next());
        
        System.out.println("enter teacher id");
        setTchId(in.nextInt());
        
        System.out.println("enter teacher salary");
        setTchSal(in.nextDouble());
        
        //---------------dept fill info------------------------------
        
        System.out.println("enter dept name");
        dp.setDeptName(in.next());
        
        System.out.println("enter dept number");
        dp.setDptNum(in.nextInt());
        
        //---------------student fill info---------------------------
        
        for (int i = 0; i < std.length; i++) {
            
            std[i]=new Student();
            System.out.println("enter info of student "+(i+1));
            
            System.out.println("name:");
            std[i].setStdName(in.next());
            
            System.out.println("id:");
            std[i].setStdId(in.nextInt());
            
            System.out.println("grade 1:");
            std[i].setG1(in.nextInt());
            
            System.out.println("grade 2:");
            std[i].setG2(in.nextInt());
            
            System.out.println("grade 3:");
            std[i].setG3(in.nextInt());
            
        }
    }
    
//-------------------------------method to printTeacherAndStudents--------------    
    public void printTeacherAndStudents (){
        System.out.println("-------------from TeacherAndStudents-------------");
        System.out.println("-------------teacher-------------");
        System.out.println("teacher name:"+tchName);
        System.out.println("teacher ID:"+tchId);
        System.out.println("teacher salry:"+tchSal);
        
        for (int i = 0; i < std.length; i++) {
            System.out.println("-------------student "+(i+1)+"------------");
            System.out.println(std[i].toString());
            System.out.println("avareg:"+std[i].findAv());
        }
    }
    
//-------------------------------method to printTeacherAndDept------------------     
    public void printTeacherAndDept(){
        System.out.println("----------------from TeacherAndDept--------------");
        System.out.println("-------------teacher-------------");
        System.out.println("teacher name:"+tchName);
        System.out.println("teacher ID:"+tchId);
        System.out.println("teacher salry:"+tchSal); 
        System.out.println("-------------dept----------------");
        System.out.println("dept number:"+dp.getDptNum());
        System.out.println("dept name:"+dp.getDeptName());
    }
    
//---------------------------------sets and gets--------------------------------
    public int getTchId() {
        return tchId;
    }
    
    public void setTchId(int tchId) {
        this.tchId = tchId;
    }
    
    public String getTchName() {
        return tchName;
    }
    
    public void setTchName(String tchName) {
        this.tchName = tchName;
    }
    
    public double getTchSal() {
        return tchSal;
    }
    
    public void setTchSal(double tchSal) {
        
        while (tchSal<=0||tchSal>3500) {
            System.out.println("tacher salary must be between 1 and 3500");
            tchSal=in.nextDouble();
        }
        
        this.tchSal = tchSal;
    }
    
}
