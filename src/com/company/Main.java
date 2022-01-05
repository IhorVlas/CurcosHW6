package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int j = 0;

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(9);
        arr1.add(11);
        arr1.add(18);
        arr1.add(20);
        arr1.add(22);

        System.out.println("Весь список: " + arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr1.size(); i++) {
            if ( arr1.get(i) % 3 == 0 ) {
                arr2.add(j, arr1.get(i));
                j++;
            }
        }
        System.out.println("кратные трем: " + arr2);

        arr1.removeAll(arr2);
        System.out.println("Итог: " + arr1);

        //--------------------------------------------------------------------

        int count = 0;

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Orange");

        System.out.println("\n" + fruits);

        for (int i = 0; i < fruits.size(); i++) {
            if ( fruits.get(i).contains("Orange") ) {
                fruits.set(i, "Grapefruit");
                count++;
                // fruits.get(i).replace("Orange", "Grapefruit");   // (fruits.get(i),"Grapefruit");}
            }
        }
        if ( count == 0 ) {
            System.out.println("the ORANGE not on the list!");
        } else {
            System.out.println(fruits);
        }

        //--------------------------------------------------------------------------------

        boolean test = false;

        ArrayList<String> firstArr = new ArrayList<>();

        firstArr.add("a");
        firstArr.add("b");
        firstArr.add("c");
        firstArr.add("d");
        firstArr.add("e");
        firstArr.add("f");

        ArrayList<String> secArr = new ArrayList<>();

        secArr.add("z");
        secArr.add("z");
        secArr.add("z");
        secArr.add("z");
        secArr.add("z");
        secArr.add("d");

        for (int i = 0; i < firstArr.size(); i++) {
            for (int k = 0; k < secArr.size(); k++) {
                if ( firstArr.get(i).equals(secArr.get(k)) ) {
                    test = true;
                }
            }
        }
        if ( test == true ) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
