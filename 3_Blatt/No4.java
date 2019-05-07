/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 7-5-2019                               *
 * Description: Singleton                       *
 * File: No4.java                               *
 * Compile: javac No4.java                      *
 \**********************************************/

class No4 {

    public class Singleton {
        private Singleton instance = null;
        int a;

        private Singleton(int a) {
            this.a = a;
        }

        public Singleton add(int a) {
            if(instance == null) {
                instance = new Singleton(a);
            } 

            return instance;
        }
    
    }
}
