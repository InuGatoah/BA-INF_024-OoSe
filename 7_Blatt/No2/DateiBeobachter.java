/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 17-6-2019                              *
 * Description: Uebung mit Threads              *
 * File: DateiBeobachter.java                   *
 * Compile: javac DateiBeobachter.java          *
 \**********************************************/

import java.io.File;

public class DateiBeobachter implements Runnable {
    java.io.File data; 
    double mod; 
    public void DateiBeobachter(String s) {
        File f = new File(s);
        this.data = f;
        this.mod = this.data.lastModified();
    }
    public void DateiBeobachter(java.io.File j) {
        this.data = j;
    this.mod = this.data.lastModified();
    }

    public void run() {
        try{
            Thread.sleep(500);
        } catch (Exeption e) {
            e.printStackTrace();
        }
    }
}
