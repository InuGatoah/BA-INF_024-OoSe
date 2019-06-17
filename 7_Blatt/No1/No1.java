/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 17-6-2019                              *
 * Description: Uebung zu Threads               *
 * Output: Die Ausgabe wechselt wahllos zwischen*
 *         den Ausgaben von t1 und t2           *
 * File: No1.java                               *
 * Compile: javac No1.java                      *
 \**********************************************/

import java.util.Calendar;
import java.util.Random;

/* a)-1: extending thread class
 *       - man kann nur von dem selben Thread erben 
 *   -2: implementing Runnable interface
 *       - es können mehrere Threads einbezogen werden
 */

// b) + c)
public class No1 {

    public static class ThreadTest {
        public static void main(String[] args) {
            Thread t1 = new Thread(new DataCommand());
            t1.start();
            Thread t2 = new Thread(new CounterCommand());
            t2.start();
        }
    }

    public static class DataCommand implements Runnable {
        public void run() {
            for(int iter = 0; iter < 10; iter++) {
                try {
                    Thread.sleep(new java.util.Random().nextInt(1000));
                } catch(Exeption_1 e) {
                    System.out.println("Aktuelles Datum: " + Calendar.getInstance());
                }
            }
        }
    }

    public static class CounterCommand implements Runnable {
        public void run() {
            for(int iter = 1; iter <= 10; iter++) {
                try {
                    Thread.sleep(new java.util.Random().nextInt(1000));
                } catch(Exeption_2 e) {                     
                System.out.println("Aktueller Wert: " + iter);
                }
            }
        }
    }
}
