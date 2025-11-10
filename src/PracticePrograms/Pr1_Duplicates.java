package PracticePrograms;

import java.util.HashMap;

public class Pr1_Duplicates {

    public static void main(String[] args) {

        int arr[] = {1,1,1,2,2,3,3,3,3,4,4,5,5,5,6,7,8,8};
        //Declare Hashmap and Hashmap variable name is map. Initially map value is empty
        HashMap<Integer, Integer> map = new HashMap<>();
        //Index value is num for each iteration the value of num will change
        for (int num:arr) {

            if(map.containsKey(num)) {

                map.put(num, map.get(num) + 1);
            }
            else
                map.put(num, 1);
        }
        System.out.println(map);
    }
}
