//package com.company;
//
//import java.io.*;
//
//public class Brut {
//    public static void main(String[] args) {
//        var text = "";
//        try {
//            text = Utils.readFileForDecryption("C:\\Users\\avole\\IdeaProjects\\newJavaProject\\src\\com\\company\\test.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        var string = Encryptor.encrypt(text);
//        var decryptedString = Decryptor.decrypt(string); // использует verify
//        // Сначала создать массив всех возможных строк
//        // Внутри decrypt пробегаться п
//
////        encryption("а_а-я!!!!!", 1);
////        encryption("а", -1);
//    }
//
//    // Verificator
//    // Encryptor
//
//    public static boolean verify(String stringForVerification) {
//        char[] chars = stringForVerification.toCharArray();
//
//        var flag = true;
//
//        for (int i = 0; i < chars.length; i++) {
//
//            // проверка, что если текущий символ - знак препинания, то после него, ЛИБО:
//            // Конец предложения
//            // Пробел и следующий символ в Uppercase
//            // Если запятая, то пробел и Lowercase
//        }
//
//        return flag;
//    }
//
//    public static void encryption(String text, int step) {
////        String input = "sdasdasdsd";
////        String[] array = new String[32];
////        for (int i = 0; i < 32; i++) {
////            array[i] = shift(input, i);
////        }
////
////        for (int i = 0; i < 32; i++) {
////            if(verify(array[i])){
////                return array[i];
////            }
////        }
//
//        int index = 0;
//        String res = " ";
//        char[] textChar = text.toCharArray();
//        char[] lower = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
//                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
//                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
//        char[] upper = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж',
//                'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х',
//                'Ц', 'Ч', 'Ш', 'Щ', 'Ы', 'Э', 'Ю', 'Я'};
//
//        for (int i = 0; i < textChar.length; i++) {
//            /* проверяю есть ли в переданной строке символы*/
//            if (textChar[i] == ',' || textChar[i] == '!' ||
//                    textChar[i] == '?' || textChar[i] == '_' ||
//                    textChar[i] == '-') {
//                System.out.print(textChar[i]);
//            } /* проверяю есть ли в переданной строке пробел*/
//            if (Character.isSpaceChar(textChar[i])) {
//                System.out.print(res);
//            }
//            /* проверяю есть ли в переданной строке прописные буквы*/
//            if (Character.isLowerCase(textChar[i])) {
//                /* смещение вправо */
//                for (int j = 0; j < lower.length; j++) {
//                    if (textChar[i] == lower[j]) {
//                        index = j;
//                        if (index + step >= lower.length) {
//                            index -= 33;
//                            System.out.print(lower[index + step]);
//                        } else {
//                            System.out.print(lower[j + step]);
//                        }
//                        /* смещение влево*/
//                    }
//                    System.out.println();
//                }
//            }
//
//            if (Character.isUpperCase(textChar[i])) {
//                for (int j = 0; j < upper.length; j++) {
//                    if (textChar[i] == upper[j]) {
//                        index = j;
//                        if (index + step >= upper.length) {
//                            index -= 32;
//                            System.out.print(upper[index + step]);
//                        } else {
//
//                            System.out.print(upper[j + step]);
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
