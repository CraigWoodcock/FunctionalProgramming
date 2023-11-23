package com.sparta.cw;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 *  create Arraylist of names
 * list must contain duplicates
 * remove duplicates
 * check names contain 6 letters
 * return list
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(getNamesof6Letters());
        
        System.out.println(getLargestNumber());
    }
    
    private static String getNamesof6Letters() {
        ArrayList<String> names = new ArrayList<>();
        
        ArrayList<String> newList = new ArrayList<>();
        names.add("Craig");
        names.add("Danielle");
        names.add("Hillary");
        names.add("Charlie");
        names.add("Luke");
        names.add("Craig");
        names.add("manish");
        names.add("martha");
        names.add("fergus");
        names.add("Craig");
        
        names.stream()
                .distinct()
                .filter(name -> name.length()==6)
                .forEach(name -> newList.add(name));
        
        return newList.toString();
    }
    
    public static OptionalInt getLargestNumber(){
        OptionalInt largestNum = IntStream.rangeClosed(1,100)
                .map(num -> num *num)
                .filter(num -> num < 100)
                .max();
                
         
     return largestNum;
    }
    
    
}
