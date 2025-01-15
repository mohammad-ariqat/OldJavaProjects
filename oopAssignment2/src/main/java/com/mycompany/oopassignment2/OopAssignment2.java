
package com.mycompany.oopassignment2;

import java.util.Scanner;
public class OopAssignment2 {
static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        //1d array of Strings
        String [] names =new String [5];
        
        enterNames(names);
        printNames(names);
        findName(names);
    }
    //--------------------------------------------------------------------------
    //Method to read 5 student names and save then in an Array.
    public static void enterNames (String names[]){
        for (int i = 0; i < names.length; i++) {
            
            System.out.println("enter name of student "+(i+1));
            String name=input.nextLine();
            
            names[i]=name;
        }
    }
    //--------------------------------------------------------------------------
    //Method to print the student names in an array in reverse order
    public static void printNames (String names[]){
        
        for (int i = 0; i < names.length; i++) {
            
            int j=names[i].length();
            
            System.out.print("\t");
            
            for (int t = 0; t <= names[i].length()-1; t++) {
            
                System.out.print(names[i].charAt(j-1));
            
                j--;
        }
    }
}
    //--------------------------------------------------------------------------
    //Method to search if name Ahmad is found in the array
    public static void findName(String  names[]){
        
        for (int i = 0; i < names.length; i++) {
            
            if (names[i].contains("Ahmad")) {
                
                System.out.print("\nAhmad found in name"+(i+1));
            }
        }
    }
}
    


