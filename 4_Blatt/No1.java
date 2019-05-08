/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 7-5-2019                               *
 * Description: a: 1) 4->Reifen Wert von Last-  *
 *                    wagen wird uebeschriben   *
 *                 2) 8->Reifen Wert wird       * 
 *                    ausgewaehlt               *
 *                 3) 8->auto1 Auto wird von    *
 *                     Lastwagen ueberschrieben *
 *                 4) 8->wie a3), die Erwaenung *  
 *                    veraendert nichts         *
 *              b: 1) 4->wie a1)                *
 *                 2) 8->wie a2)                *
 *                 3) 4->getReifen von Auto     *
 *                    wird nicht überschriben   *
 *                 4) 4->wie b3), die Erwaenung *
 *                    veraendert nichts         *
 *              c: 1) 4->wie a1)                *
 *                 2) 8->wie a2)                *
 *                 3) /->Kompilierfehler        *
 *                 4) 8->Lastwagen wird         *
 *                    aufgerufen                *
 * File: No1.java                               *
 * Compile: javac No1.java                      *
 \**********************************************/

class No1 {
    
    public static class Auto {
        int reifen = 4;
        int getReifen() {
            return this.reifen;
        }
    }

    public static class Lastwagen extends Auto {
        int reifen = 8;
        int getReifen() {
            return this.reifen;
        }
    }

    public static void main(String[] args) {
        Auto auto1 = new Lastwagen();
        System.out.println(auto1.reifen);                   
        System.out.println(((Lastwagen) auto1).reifen);     
        System.out.println(auto1.getReifen());              
        System.out.println(((Lastwagen) auto1).getReifen());
        
    }

}
