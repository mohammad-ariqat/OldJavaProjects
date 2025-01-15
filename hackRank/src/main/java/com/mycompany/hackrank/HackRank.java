/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hackrank;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

/**
 *
 * @author bhamo
 */
public class HackRank {
    
    public static void main(String[] args) {
        
        System.out.println(strStr("hello", "ll"));
                
    }
    
      public boolean isValid(String s) {
        /*if (s.contains("(") && !s.contains(")")) {
            return false;
            
        }else if (s.contains("{") && !s.contains("}")) {
            return false;
        }else if (s.contains("[") && !s.contains("]")) {
            return false;}
        return true;}*/
         Stack<Character> stack = new Stack<>();
          for (int i = 0; i < s.length(); i++) {
              if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                  stack.push(s.charAt(i));
              }else{
                  if (stack.isEmpty()) {
                      return false;
                  }else if (stack.lastElement()== '(' && s.charAt(i) == ')' || stack.lastElement()== '[' && s.charAt(i) == ']' || stack.lastElement()== '{' && s.charAt(i) == '}') {
                      stack.pop();
                  }
              
              }
          }
          if (stack.isEmpty()) {
              return true;
          }else{return false;}
}
      
      
      
      public static int singleNumber(int[] nums) {
            Arrays.sort(nums);
            for (int num : nums) {
            System.out.print(num + " ");
        }
          for (int i = 0; i < nums.length; i+= 2) {
              if (i+1 == nums.length) {
                  return nums[i];
              }
              if ((nums[i] ^ nums[i+1]) != 0) {
                  return nums[i];
              }
          }
          return 0;
      }
      
      public static int lengthOfLastWord(String s) {
        int index =s.length()-1;
        int count = 0 ;
          while (s.charAt(index) == ' ') {              
              index--;
          }
          while (s.charAt(index) != ' ') {
              index--;
              count++;
              if (index <0) {
                  break;
              }
          }
          
          return count;
        
    }
      
      public static int strStr(String haystack, String needle) {
          //hay == "mississippi" need = "pi"
          int r = haystack.indexOf(needle);
          return r;
          /*if (haystack.equals(needle)) {
              return 0;
          }
          if (!haystack.contains(needle)) {
              return -1;
          }else{
              int count =0 ;
              int x=0;
                        //2
              for (int i = 0; i < haystack.length(); i++) {
                  
                  if (count == needle.length()) {
                      return i-1;
                  }
                  
                  count = 0;
                  x = 0;
                  
                  if (haystack.charAt(i) == needle.charAt(0)) {
                      if (i >=needle.length() && i+needle.length() == haystack.length()) {
                          return i;
                      }
                                //j=8/2/3/4        // 4
                      for (int j = i; j < needle.length(); j++) {
                                                                   //0/1/2
                          if (haystack.charAt(j) == needle.charAt(x)) {
                              count++;//1/2/3
                              x++;//1/2/3
                              if (j+1 == needle.length() && x != needle.length() &&haystack.charAt(j+1) == needle.charAt(x)) {
                                  count++;
                              }
                          }else{
                              break;
                          }
                      }
                  }   
              }
          }     
          return -1;*/
    
    }
      public double myPow(double x, int n) {
          int count = 0;
          double res = 1;
          if (x == 1) {
             return 1;
          }
          if (n <0) {
              n *= -1;
              while (count <= n) {              
              res *= x;
              count++;
          }
              return 1/res;
          }else{
          while (count <= n) {              
              res *= x;
              count++;
          }
          
          }
          
          
          return res;
    }
        
    }
        
    




