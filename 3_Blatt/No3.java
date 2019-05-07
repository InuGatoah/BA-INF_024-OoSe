/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 7-5-2019                               *
 * Description: s.play(pl) ruft "song()" auf.   *
 *              beim zweiten Aufruf ist Kassette*
 *              dort eingetragen                *
 * File: No3.java                               *
 * Compile: javac No3.java                      *
 \**********************************************/

class No3 {

    public interface Playable {
        void song();
    }

    public static class Kassette implements Playable {
        public void song() {
            System.out.println("Alle meine Entchen...");
        }
    }

     public static class CD implements Playable {
        public void song() {
            System.out.println("O Tannenbaum...");
        }
    }

    public static class Stereoanlage {
        public void play(Playable p) {
            p.song();
        }
    }

   public static void main(String[] args) {
       Stereoanlage s = new Stereoanlage();
       Playable pl = new CD();
       s.play(pl);
       pl = new Kassette();
       s.play(pl);
   }
}
