/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 18-6-2019                              *
 * Description: Uebung zu Generics              *
 * File: No2.java                               *
 * Compile: javac No2.java                      *
 \**********************************************/

public class No2 {

    static class R {}
    static class E extends R {}
    static class B extends R {}
    static class G extends B {}
    static class U {}
    public static class Foo {
        public static <T> T bar(T x, T y) {
            return x;
        }
        public static void main(String[] args) {
            Object o;
            R r = new R();
            E e = new E();
            B b = new B();
            G g = new G();
            U u = new U();
            R[] x;
            E[] y;

            //r = bar(r,b);                 Ja
            //r = bar(b,r);                 Ja
            //r = bar(e,g);                 Ja
            //r = bar(b,g);                 Ja
            //e = bar(r,b);                 Nein
            //u = bar(u,r);                 Nein
            //o = bar(e,u);                 Ja
            //b = bar(e,g);                 Ja
            //x = bar(new E[2], new B[4];   Nein
            //y = bar(new E[4], new B[11];  Nein
            //o = bar(new G[8], new U[5];   Nein

        }
    }
}
