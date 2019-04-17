/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 12-4-2019                              *
 * Description: a) Bei wird k vor der Ausgabe um*
 *                 1 erhöt, bei c wird es erst  *
 *                 nach der Ausgabe um 1 erhöt  * 
 *              b) Int / int = int,             *
 *                 int / double = double        *
 *              c) "b = false" ist kein         *
 *                 Vergleich, sondern eine      *
 *                 Zuweisung   
 * File: No3.java                               *
 * Compile: javac No3.java                      *
 \**********************************************/

class No3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int k = sc.nextInt();
        System.out.println(++k); //a
        System.out.println(k); //b
        System.out.println(k++); //c

        int k2 = 5;
        double result = k2 / 2.0; //Stelle 1
        System.out.println("5 /2 = " + result); //d

        boolean b = false;
        System.out.println("b ist " + (b ? "true" : "false"));
    }        
}
