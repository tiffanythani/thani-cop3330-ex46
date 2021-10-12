/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tiffany Thani
 */

package ex46;
import java.util.*;
import java.io.*;

class Exercise46 {
    public static void main(String args[]) throws IOException {
        //a file pointer is assigned to input file
        Scanner input=new Scanner(new File("exercise46_input.txt"));
        Map<String,Integer> hm=new TreeMap<String,Integer>();

        //read in values and add to map

        while(input.hasNext()) {
            String str=input.next();
            if(hm.containsKey(str))
                hm.put(str,hm.get(str)+1);
            else
                hm.put(str,1);
        }

        // print the histogram
        for(String word:hm.keySet()) {
            System.out.printf("%-10s",word+":");
            for(int i=hm.get(word);i>0;i--)
                System.out.print("*");
            System.out.println();
        }

    }
}