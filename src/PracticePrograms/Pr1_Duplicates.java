package PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class Pr1_Duplicates {

    public static void main(String[] args) {

       int array[] = {1,1,2,3,4,4,4,5,6,7,7};

       Map<Integer,Integer> duplicates = new HashMap<>();

       for(int num:array) {

           if (duplicates.containsKey(num)) {
               duplicates.put(num, duplicates.get(num) + 1);
           } else
               duplicates.put(num, 1);
       }
        System.out.println(duplicates);
       }
    }