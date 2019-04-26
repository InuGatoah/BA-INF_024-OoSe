/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 2019-04-24                             *
 * Description: Loest das modifizierte          *
 *              Lottoproblem                    *
 * File: No1.java                               *
 * Compile: javac No1.java                      *
 \**********************************************/

import java.util.Scanner;

public class No1 {
        public static long Fakultaet(long a) {
            long result = 1;
                for(long iter = a; iter >= 1; iter--){
                    result *= iter;
                    System.out.println("result = " + result);
                }    
            return result;
        }

        public static long Koeffizient(long n, long k) {
            long result = 0;
            if(k >= 0 && k <= n) {
                result = Fakultaet(n) / (Fakultaet(k) * Fakultaet(n-k));
            } else if(n >= 0 && n <= k) {
                result = 0;
            } else {
                System.out.println("Bitte positive Zahlen eingeben");
                System.exit(0);
            }
            return result;
        }
        
        public static long Loesung(long n, long k) {
            long result = 0;
            result = Koeffizient(n, k) * Fakultaet(k);
            return result;
        }
        
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Bitte geben sie die Zahl n ein: ");
        long n = obj.nextLong();

        if(n <= 0) {
            System.out.println("Zahl ist negativ");
            System.exit(0);
        }

        System.out.println("Bitte geben sie die Zahl k ein: ");
        long k = obj.nextLong();

        if(k <= 0) {
            System.out.println("Zahl ist negativ");
            System.exit(0);
        }

        System.out.println( "Das Ergebniss ist: " + Loesung(n, k));
    }
}
