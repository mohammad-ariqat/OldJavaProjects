package com.mycompany.oop1;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
public class Oop1 {
static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        
        



    }
   
    
    public void notes (){
       /*      
2d array
      int a [][]=new int [3][3];
      int x [][]=new int [2][2];
      x[0][0]=5;
      x[0][1]=3;
      int x[][]={{5,7},{6,9},{2,4}};
bultin methods:
equals
       String s1 ="kjfnerwiuhgperg";
       String s2 ="kjfnerwiuhgperg";
        if (s1.equals(s2)) {
            System.out.println("s1==s2");
        }
is empty
       String s1 ="kjfnerwiuhgperg";
        if (s1.isEmpty()) {
            System.out.println("empty");
        }
split: cut the string on the var i will give it


String s2 ="kjf; ner; wiuh; gperg";
       String list  [] =s2.split(" ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            
        }
toCharArray   turn sring to array of chars 
        
String s2 ="kjf; ner; wiuh; gperg";

char c []=s2.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]==' ') {
                System.out.println();
            }else
            System.out.print(c[i]);
        }
        split
        serch fo youer name in this text
        print word on line 
        print string in revers way
        
        lec 2
        math methods
        
        
        Integer x =5;
        String a=x.toString();
        System.out.println(x.compareTo(7));//is a method for integer 
        
        System.out.println(x.equals(5));
        
        System.out.println(x.toString());
        
        System.out.println(Math.round(15.607));
        
        System.out.println(Math.sin(30));
        
        System.out.println(Math.cos(90));
        
        
        
        methods on  arrays:
        1-sort an array
        
        
double []z =new double[10];
        for (int i = 0; i < z.length; i++) {
            z[i]=(int)(Math.random()*100);
        }System.out.println("--------befor---------");
        for (int i = 0; i < z.length; i++) {
            
            System.out.println(z[i]);
        }
        Arrays.sort(z);
        System.out.println("--------after---------");
        for (int i = 0; i < z.length; i++) {
            
            System.out.println(z[i]);
        }
        
        accses modifaiers :
        static 
        - privet
        + public
        # protected :only in the id packag and sub clases
        
        constent final int ab=7;
        final double by =3.14;
        
        
        
        
        array of objicts:
        
        --------------------
        |   dept           |
        -------------------
        |-septId
        |-deptName
        |-deptloc
        -------------------
        dept(int,string,string)
        deptInfo
        search dept (name)
        read data
        ------------------------
        ---------------------------\
        craat java program to implement 10 deps use aarrAy of objects
        Dept dept =new Dept(int,string,String);
        
        Dept[] dpt=new Dept[10];
        ==================================
        UML:
        a grafical rep of the classes
        
        over loading in the same class
        
        over riding in difrent classses
        ==================================
        the self looping method 
        its bad becuse it takes alot of the mommery ram (bufring):
        ----------------------------------------------------------------
        
        java classes reletion ships:
        
        how to bulid relations:
        1-assosiation between two classes:
        a-composition:strong raltion     \like the eye and the head\or the studennt and the teacher
        b-aggregation 
        part of ,has a=comp or agg
        
        relation types:
        1-one to one  \like human and head\  not like studennt and teacher\
        2-one to many   \like studennt and the teacher\
        3-many to many  \like many courses and students\
        
        to make relation we take an object of a class and put it in anthoer
        
        \\like we put the head objict in the human class  and we can put the obj in constrector\\(one to one)\
        
        //like student teracher //one to many we need to make array of obj for students 
        
        ----------------------------------------------29/11---------------------------------------------
        c-inheratance:(is a)
        (==>)=inheratance
        (class==>class)
        =====class 1-super class (father)=====\
        peson\     |        |  student
        ------      |       | ---------              [this is an inhertance between person and student]
        id\         |       | stAV
        name\       |  ==>  |                        {public class student extends person}
        addres\ |   |       |
        ----------\---------------------------
        
        ------------------------------------------------------------------------------------------------
        
        
        ------------------------------------------------------4/12--------------------------------------
        //object is an array that can save difrent types of data
        Object [] obj = new Object[2];
        obj[0]=99;
        obj[1]='a';
        obj[2]="fefm";
        
        
        inheretance:
        
        \//this is  a class//\
             /\
             ||      ==>extends    IS-A
             ||
        \//class2//\
        
        
        
        ---------------------------------------27/12--------------------------------------------------
        abstract:gives slight info about method the detial will  be in the other class
        you cant make an object out of it
        public abstract class1 (){
        
        public abstract void ....();
        
        we make it so we can hide the code 
        use inheretence to make it work 
        the abstract methode must be made in the new class
        YOU CAN MAKE A CONSTRECTOR
        
        
        
        ---interface:
        gives the  constent, final stuff that is genrall on the hole project 
        saves time 
        
        string final UniName="adjfnef";
        String final ADDRESS="AMMAN";
        
        all methods in inter face are abstract ;==no body for methode
          is abstract class
        
          vars are final in it and in  capital littrrs
        
        to connect an interface and a class we use implements
          u cant make a constector in it ;
          /
        
        
        
        */

   }
}
