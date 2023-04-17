package org.example;


    public class Loader {
        public static void main(String[] args) {
            int a = 10;
            int b = 25;
            int c = 0;

            c = a + b;
            System.out.println(c);
            c += a;
            System.out.println(c);
            c -= a ;
            System.out.println(c);
            c *= a ;
            System.out.println(c);
            c /= a ;
            System.out.println(c);
            c %= 13 ;
            System.out.println(c);
        }
    }




    /*public static void main(String[] args) {
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
}*/
