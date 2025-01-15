/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author bhamo
 */
public class Bro {
 
    public static void main(String[] args) {
        
        String s1 = "bacd";
        
        String q1 = "abcd";
        String q2 = "cab";
        String q3 = "aa";
        String q4 = "bba";
        
      
        
        char[] c = new char[4];
        c = q2.toCharArray();
        Arrays.sort(c);
        
        
       String s = new String(c);
        
        
        
        
        if (s1.contains(s)) {
            System.out.println("yes");
        }
        
        
        
        

     
        
    
}}
