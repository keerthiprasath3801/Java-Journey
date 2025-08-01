package com.strings;

public class Comparision {

        public static void main(String[] args) {
            String a = "SKPrasath";
            String b = "SKPrasath";
            String c = a;
            System.out.println(c == a);
            // ==
//        System.out.println(a == b);

            String name1 = new String("SKPrasath");
            String name2 = new String("SKPrasath");

            System.out.println(name1 == name2);

            System.out.println(name1.equals(name2));

        }
    }

