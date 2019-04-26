/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 2019-04-26                             *
 * Description: Euklidischer Algorithmus        *
 * File: No3.java                               *
 * Compile: javac No3.java                      *
 \**********************************************/

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Eukidischer Algorithmus");
        System.out.println("Geben Sie eine Zahl a ein: ");
        int a = obj.nextInt();

        System.out.println("Geben Sie eine Zahl b ein: ");
        int b = obj.nextInt();


        System.out.println("Das Ergebnis ist: " + Euklid(a,b));
    }

    public static int Euklid(int a, int b) {
        int result = 0;

        if(a==0) {
            result = b;
        } else {
            while(b != 0) {
               if(a > b) {
                  a = a - b;
               } else {
                  b = b - a;
               }
            }
            result = a;
        }
        return result;
    }
}
