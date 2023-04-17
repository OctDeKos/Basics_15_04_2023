package org.example;

public class Loader {
    public static void main(String[] args) {
        int a = 190;
        int b = 245;
        boolean result = true;
        System.out.println(result); //true
        boolean bool = b > a;
        System.out.println(bool);//true
        result = a < 167;
        System.out.println(result);//false
        result = bool != result;
        System.out.println(result);
        System.out.println(bool);
    }
}
