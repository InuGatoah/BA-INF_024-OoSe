/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 30-4-2019                              *
 * Description: Stelle 1:                       *
 *              1: ((C2) a).f1();               *
 *                 -> C2::f1                    *
 *              2: ((C1) b)f1();                *
 *                 -> C2::f2                    *
 *              3: System.out.println(a.s);     *
 *                 -> 1                         *
 *              4: b.f1();                      *
 *                 -> C2::f1                    *
 *              5: b.f2();                      *
 *                 -> C1::f2                    *
 *              6: b.f3();                      *
 *                 -> C2::f3                    *
 *              7: C1 c = new C1(); c.f3();     *
 *                 -> Kompilierfehler           *
 *                 "cannot find c"              *
 *              8: C1 c = new C1();             *
 *                 c.f3();                      *
 *                 -> Laufzeitfehler            *
 *                 "class C1 cannot be cast to  *
 *                 class C2"                    *
 *                                              *
 * File: No1.java                               *
 * Compile: javac No1.java                      *
 \**********************************************/

class No1 {

    static class C1 {
        static int s = 1;
        void f1() {
            System.out.println("C1::f1");
        }
        void f2() {
            System.out.println("C1::f2");
        }
    }

    static class C2 {
        static int s = 2;
        void f1() {
            System.out.println("C2::f1");
        }
        void f3() {
            System.out.println("C2::f2");
        }
    }

    public class Test {
        public void main(String[] args) {
            C1 a = new C2();
            C2 b = new C2();
            //Stelle 1
        }
    }
}
