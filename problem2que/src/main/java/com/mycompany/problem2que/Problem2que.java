/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problem2que;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhamo
 */
public class Problem2que {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
      int x = in.nextInt();
      
      int size = in.nextInt();
      int[] z = new int[size];
        for (int i = 0; i < size; i++) {
            z[i] = (in.nextInt());
        }
        Arrays.sort(z);
        
        int res = 0;
        
       
        }
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int testcase = in.nextInt();
      
      
      
      
      String p = in.next();
        ArrayList<Character> ch= new ArrayList<Character>();
      int count = 0;
        for (int i = 0; i < p.length(); i++) {
            if (!ch.contains(p.charAt(i))) {
                ch.add(p.charAt(i));
            }else{
                count++;
            }
        }
      
      
      
      
      
        if (n.contains("H") || n.contains("Q") || n.contains("9") || n.contains("+")) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
      int nextt = 0;
      int[] numss = new int[3];
        for (int i = 0; i < testcase; i++) {
           numss[0] = in.nextInt();
           numss[1] = in.nextInt();
           numss[2] = in.nextInt();
           
            if (numss[0] + numss[1] == numss[2] || numss[1] + numss[2] == numss[0] || numss[0] + numss[2] == numss[1]) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
        
    }
   
}

    /*public int largestCombination(int[] candidates) {
        int len = 0;
        int len2 = 0;
        for (int i = 0; i < candidates.length; i++) {
            len = Integer.toBinaryString(candidates[i]).length();
            for (int j = 0; j < candidates.length; j++) {
                len2 = Integer.toBinaryString(candidates[j]).length();
                if ( len <=len2 ) {
                    
                }
            }
        }
    }
    public int scoreOfString(String s) {
        int res = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < s.length()-1; i+=2) {
            num1 = s.charAt(i);
            num2 = s.charAt(i+1);
            res += Math.abs(num1 - num2);
        }
        return res;
    }
    public int[] getConcatenation(int[] nums) {
        int res[] = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;
        
    }
    
}
    /*public int minChanges(String s) {
   
        int numOfChange = 0;
        
        for (int i = 0; i < s.length()-1; i+=2) {
            if (s.charAt(i) != s.charAt(i+1)) {
                numOfChange++;
            }
            
        }
        return numOfChange;
        
    }
        /*isCircularSentence("leetcode exercises sound delightful");
        int num = in.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
       */
        /*int[] students =   {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        
       int SqSand = 0;
       int SerSand = 0;
       int SqStd = 0;
       int SerStd = 0;
       
       for (int i = 0; i < students.length; i++) {
           if (students[i] == 1) {
               SqStd++;
               
           }else{
               SerStd++;
               
           }
           if (sandwiches[i] == 1) {
               SqSand++;
               
           }else{
               SerSand++;
              
           }
           
       }
       int res = 0;
        if (SerStd > SerSand) {
            res = SerStd - SerSand;
        }
        if (SqStd > SqSand) {
            res  = res + SqStd - SqSand;
        }
       
        System.out.println(res);
        */
    
    /*public int minChanges(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String ss = ch.toString();
        String[] Sarr = ss.split("0");
        System.out.println(Sarr[0]);
        System.out.println(Sarr[1]);
    }*/
    /*public static boolean isCircularSentence(String sentence) {
        String[] sen = sentence.split(" ");
        int numOftrue = 0;
        for (int i = 0; i < sen.length-1; i++) {
            if (sen.length != 1) {
                if (sen[i].charAt(sen[i].lastIndexOf(sen[i])) == sen[i+1].charAt(0)) {
                    numOftrue++;   
                }
            }
        }
        if (sen[0].charAt(0) == sen[sen.length-1].charAt(sen[sen.length-1].length())) {
            numOftrue++;
        }
        
        if (numOftrue == sen.length) {
            return true;
        }else{
            return false;
        }
    }*/
   /* public String compressedString(String word) {
        int count = 1;
        String res = "";
        for (int i = 0; i < word.length()-1; i++) {
            if (i == word.length()-1) {
                if (count ==1) {
                res = res + "1"+word.charAt(i);
                }else if (count <= 9) {
                    res = res + count + word.charAt(i);
                    count = 1;
                }else{
                    /*res = res +"9" + word.charAt(i) + (count-9) + word.charAt(i);
                    count = 1;*/
    /*
                    while (count >= 9) {                        
                        res = res + "9" + word.charAt(i);
                        count -= 9;
                    }
                    if (count >=1) {
                        res = res + count + word.charAt(i);
                    }
                }
            }
            if (word.charAt(i) == word.charAt(i+1)) {
                count++;
                
            }else{
                if (count ==1) {
                res = res + "1"+word.charAt(i);
                }else if (count <= 9) {
                    res = res + count + word.charAt(i);
                    count = 1;
                }else{
                    res = res +"9" + word.charAt(i) + (count-9) + word.charAt(i);
                    count = 1;
                }   
            }
        }
        return res;
    }
    //5 1 1 1  k=0
   public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int valofk = tickets[k];
        Queue<Integer> qque = new PriorityQueue<Integer>(Collections.reverseOrder());
        Queue<Integer> que = new LinkedList<Integer>();
        
        int[] res = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            qque.offer(tickets[i]);
        }
        int head = 0;
        int deff = 0;
        int timer = 0;
        while (timer !=k) {    
           timer++;
           head = qque.poll();
           deff = head - time;
           time = time +deff;
           
       }
        return time + k;
        
        
        /*Queue<Integer> que = new LinkedList<Integer>();
        
        for (int i = 0; i < tickets.length; i++) {
            que.offer(tickets[i]);
        }
        
        int time = 0;
        int valofk = tickets[k];
        
        while (!que.isEmpty()) {

            int head = que.poll();
            time++;
            if (head != 1) {
                head--;
                que.offer(head);
            }
            if (time ==k+1) {
                valofk--;
                if (valofk == 0) {
                    return time;
                }
                k = que.size();
            }
        }
        return 0
   /*
   public int[] numberGame(int[] nums) {
        Queue<Integer> qque = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            qque.offer(nums[i]);
        }
        
        int head1 = 0;
        int head2 = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < qque.size()-1; i++) {
           head1 = qque.poll();
           head2 = qque.poll();
           res[i] = head2;
           res[i+1] = head1;
           
       }
        return res;
   }
   public int lastStoneWeight(int[] stones) {
       if (stones.length ==1) {
          return stones[0];
       }
 
       Queue<Integer> qque = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            qque.offer(stones[i]);
        }
        int stone1 = 0;
        int stone2 = 0;
        
        while (qque.size()>1) {           
           stone1 = qque.poll();
           stone2 = qque.poll();
            if (stone1 != stone2) {
                qque.offer(stone1 - stone2);
            }
       }
        if (qque.isEmpty()) {
           return 0;
       }else{
            return qque.poll();
        }
    }
   public String makeFancyString(String s) {
     
       char[] c = s.toCharArray();
       String res = "";
       char ch1 = ' ';
       int t = 0;
       for (int i = 0; i < c.length; i++) {
           ch1 = c[i];
           if (ch1 == c[i+1]) {
               t++;
           }
           if (t != 3) {
               res = res + ch1;
           }else{
               t = 0;
           }
       }
       return res;
    }
   public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> que = new LinkedList<Integer>();
        Queue<Integer> que2 = new LinkedList<Integer>();
        
        for (int i = 0; i < students.length; i++) {
            que.offer(students[i]);
            que2.offer(sandwiches[i]);
        }
        int timer = 0;
        
        while (timer != que.size()) {           
            if (que.peek() == que2.peek()) {
                que.poll();
                que2.poll();
                timer = 0;
            }else{
                timer++;
                que.offer(que.poll());
            }
            
       }
        return que.size();
    }
   public int ccountStudents(int[] students, int[] sandwiches) {
       int SqSand = 0;
       int SerSand = 0;
       int SqStd = 0;
       int SerStd = 0;
       
       for (int i = 0; i < students.length; i++) {
           if (students[i] == 1) {
               SqStd++;
           }else{
               SerStd++;
           }
           if (sandwiches[i] == 1) {
               SqSand++;
           }else{
               SerSand++;
           }
           
       }
       int res = (SqStd - SqSand) + (SerStd - SerSand);
       return res;
   }
*/

