/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 11-4-2019                              *
 * Description: a: Die Zahl ändert sich selbst  *
 *              bei a erst in der nächsten Reihe*
 *              b: k2 muss als double initiali- *   
 *              siert werden                    *
 * File: No3.java                               *
 * Compile: javac No3.java                      *
 \**********************************************/

public class No3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int k = sc.nextInt();
        System.out.println(++k); //a
        System.out.println(k); //b
        System.out.println(k++); //c

        int k2 = 5;
        double result = k2 / 2; //Stelle 1
        System.out.println("5 /2 = " + result); //d

        boolean b = false;
        if(b = false) {
            System.out.println("b ist falsch."); //e
        } else {
            System.out.println("b ist wahr."); //f
        }
    }
}
