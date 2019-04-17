 /***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 12-4-2019                              *
 * Description: 1: false  Vergleicht die Werte  *
 *              2: true  wie 1 aber b = 15      *
 *              3: 45  bitweise xor             *
 *              4: 45  wie 3, a wird am Ende der* 
 *                     Rechnung um 1 erhöt      *
 *              5: 28  7: c wird zuerst um 1    *
 *                     erhöt, dann wird 7 um 2  *
 *                     Stellen nach links       *
 *                     geshiftet                *
 *              6: 16  a,b,c bekommen den hexa- * 
 *                     dezimal Wert 10 (16)     *                        
 *              7: 10.0  1 * 10¹                *                         
 * File: 4.java                                 *
 * Compile: javac 4.java                        *
 \**********************************************/

class Operatoren {
    public static void main(String[] args) {
        int a = 15;
        int b = 34;
        int c = 1;
        System.out.println("1: " + (a==b));
        System.out.println("2: " + (a==b-19));
        System.out.println("3: " + (a^b));
        System.out.println("4: " + (a++^b));
        System.out.println("5: " + (7<<++c));
        System.out.println("6: " + (a=b=c=0x10));
        System.out.println("7: " + (1e1));
    }
} 
