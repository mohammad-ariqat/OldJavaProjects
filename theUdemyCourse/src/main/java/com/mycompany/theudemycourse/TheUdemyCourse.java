/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.theudemycourse;

import java.util.Arrays;

/**
 *
 * @author bhamo
 */
public class TheUdemyCourse {

    public static void main(String[] args) {
        int num1= 17 ;
        int num2 = 71;
        System.out.println(num1 & num2 );
        System.out.println(Integer.bitCount(num2));
        System.out.println(Integer.toBinaryString(num2));
            
        
    }
    public int largestCombination(int[] candidates) {
        
        int counter = 0;
        int lrg = 0;
        for (int i = 0; i < 16777216; i= i*2) {
            if (lrg <= counter) {
                lrg = counter;
            }
            counter = 0;
            for (int j = 0; j < candidates.length; j++) {
                if ((candidates[j] & i )== 1) {
                    counter++;
                }
            }
        }
        return lrg;
    }
}
