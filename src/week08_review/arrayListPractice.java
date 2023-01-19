package week08_review;

import java.util.ArrayList;

public class arrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        list.add(10);
        list.add(10);

        System.out.println(list);

        System.out.println(list.size());



    }
}
/*
Write a program that can return the first unique elements from an arrayList
Do not use indexOf & lastIndexOf methods
 */