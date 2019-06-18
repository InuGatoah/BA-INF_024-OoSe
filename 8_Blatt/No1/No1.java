/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 18-6-2019                              *
 * Description: Uebung zu Generics              *
 * File: No1.java                               *
 * Compile: javac No1.java                      *
 \**********************************************/

public class No1 {

    public static class TierKaefig<E> {
        private E insasse;
        public void setInsasse(E x) {
            insasse = x;
        }
        public E getInsasse() {
            return insasse;
        }
    }

    public static class Tier {}
    public class Hund extends Tier {}
    public class Katze extends Tier {}

    public static void main(String[] args) {
        
        /* a)
         *  TierKaefig<Tier> kaefig = new TierKaefig<Katze>();
         *  Compilier Fehler: incomatible types: TierKaefig<No1.Katze> cannot be converted to TierKaefig<Tier>
         */

        /* b)
         *  TierKaefig<Hund> kaefig = new TierKaefig<Tier>();
         *  Compilier Fehler: cant convert, like a)
         */

        /* c)
         *  Tierkaefig<?> kaefig = new Tierkaefig<Katze>();
         *  kaefig.setInsasse(new Katze());
         *  Compilier Fehler: setInsasse(Katze) ist nicht statisch definiert 
         */

        /* d)
         *  TierKaefig kaefig = new TierKaefig();
         *  kaefig.setInsasse(new Hund());
         *  Compilier Fehler: wie c)
         */
    }
}
