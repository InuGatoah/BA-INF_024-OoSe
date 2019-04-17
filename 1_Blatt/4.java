 /***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 11-4-2019                              *
 * Description: 1: false Vergleicht den Wert von*
 *              a und b                         *
 *              2: true Wie 1 doch b = 15       *
 *              3: 45 
 *              4: 45 
 *              5: 28
 *              6: 16                           
 *              7: 10.0                         
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
