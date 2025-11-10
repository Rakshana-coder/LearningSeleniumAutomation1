package PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class Pr2_DuplicatesInArray {

    public static void main(String[] args) {

        int array[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,7,7,8};
        //Declare an Hashmap
        Map<Integer,Integer> duplicates = new HashMap<>();
        //Using for each loop and num will be changes as 1, 2, 3 and the iterations will continue
        for (int num:array) {
        //build a logic
        //For 1st Iteration contains key will show as false and will come out of loop
        //From 2nd iteration as 1 is already present in duplicates and again its 1
        //then it will be true and duplicates will be added
        if (duplicates.containsKey(num)) {
            duplicates.put(num, duplicates.get(num) + 1);
        }
        else
        //In 1st Iteration the value is 1 and key is num
            duplicates.put(num,1);
        }
        System.out.println(duplicates);
    }
}
