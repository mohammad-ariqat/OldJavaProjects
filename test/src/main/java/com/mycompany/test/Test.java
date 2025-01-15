/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author bhamo
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double l = in.nextDouble();
        double n = in.nextDouble();
        double m1 =0,m2 =0;
        
        double x1=0, x2, x3, x4;
        double y1=0, y2, y3, y4;
        
        for (int i = 0; i < n-1; i++) {
            m1 = l/2;//32 //16
            m2 = m1/2;//16 //8
            
            x1 = x1 + m2;//16 + 8 = 24
            y1 = y1 + m2;
            
            l = m1;
            System.out.println(l);
        }
        
        x2 = x1 + l;
        y2 = y1;
        
        x3 = x2;
        y3 = y2 + l;
        
        x4 = x1;
        y4 = y1 + l;
        
        System.out.format("%.8f ", x1);
        System.out.format("%.8f\n", y1);
        System.out.format("%.8f ", x2);
        System.out.format("%.8f\n", y2);
        System.out.format("%.8f ", x3);
        System.out.format("%.8f\n", y3);
        System.out.format("%.8f ", x4);
        System.out.format("%.8f\n", y4);
        
    }
     public void rotate(int[][] matrix) {
         for (int i = 0; i < matrix.length; i++) {
             
         }
    }
    
    
    
}
