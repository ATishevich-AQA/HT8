package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int copopiesAmount = 0;
        int maxCopiesValue = 322;

        ArrayList<Integer> mylist = new ArrayList<>();

        for (int i = 0; i < maxCopiesValue; i++) {
            for (int j = 0; i < j + 1; j++) {
                mylist.add((int) (Math.random() * 100 + 1));
                if (mylist.get(j).equals(mylist.get(i))) {
                    copopiesAmount++;
                    System.out.println("Копия найдена");
                }
                else System.out.println("Нет копии");
                if (copopiesAmount > 2) {
                    System.out.println(mylist);
                    System.out.println(copopiesAmount);
                    break;
                }
            }
        }
    }
}
