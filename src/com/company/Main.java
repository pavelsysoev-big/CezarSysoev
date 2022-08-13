package com.company;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


import static java.lang.Character.toUpperCase;

public class Main {


    public static void main(String[] args) throws IOException {
        brute_force();

//        System.out.println(encryption("Hello world I am",-3));
//        System.out.println(encryption("Hello world",3));


    }

    public static void brute_force() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/avole/Documents/147.txt.txt"));
        String str = bufferedReader.readLine();
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/avole/Documents/148.txt"));
        boolean v = false;
        String[] library = {"I", "am", "Pavel","hi","Hello","world"};
        char[] chars = new char[str.length()];
        int count = 1;
        while (v == false) {

            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i)) && Character.isUpperCase(str.charAt(i))) {
                    chars[i] = (char) (((((int) (str.charAt(i))) - 65 + count) % 26) + 65);

                } else if (Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i))) {
                    chars[i] = (char) (((((int) (str.charAt(i))) - 97 + count) % 26) + 97);
                } else {
                    chars[i] = str.charAt(i);
                }
            }
            String x = String.copyValueOf(chars);

            String[] newLibrary = x.split(" ");
            for (int f = 0; f < library.length; f++) {
                for (int y = 0; y < newLibrary.length; y++) {
                    if (newLibrary[y].equals(library[f])){
                        System.out.println(x);
                        bufferedWriter.write(x);
                        bufferedWriter.close();
                        v = true;

                    }
                    break;
                }
            }count++;
        }
    }
        public static String encryption (String str,int step) throws IOException {
            BufferedWriter one_four_eight = new BufferedWriter(new FileWriter("C:/Users/avole/Documents/148.txt"));
            char[] chars = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i)) && Character.isUpperCase(str.charAt(i))) {
                    chars[i] = (char) (((((int) (str.charAt(i))) - 65 + step) % 26) + 65);
                } else if (Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i))) {
                    chars[i] = (char) (((((int) (str.charAt(i))) - 97 + step) % 26) + 97);
                } else {
                    chars[i] = str.charAt(i);
                }
            }
            String x = String.copyValueOf(chars);
            one_four_eight.write(x);
            one_four_eight.close();
            return x;
        }

        public static void unencription (String str,int step){
            char[] chars = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i)) && Character.isUpperCase(str.charAt(i))) {
                    chars[i] = (char) (((((int) (str.charAt(i))) - 65 + step) % 26) + 65);
                } else if (Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i))) {
                    chars[i] = (char) (((((int) (str.charAt(i))) - 97 + step) % 26) + 97);
                } else {
                    chars[i] = str.charAt(i);
                }
            }
            String x = String.copyValueOf(chars);
            System.out.println(x);
        }


    }























