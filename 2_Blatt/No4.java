/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 30-4-2019                              *
 * Description: Anwedung objektorientierter     *
 *              Konzepte                        *
 * File: No4.java                               *
 * Compile: javac No4.java                      *
 \**********************************************/

class No4 {

    public static class Schiff {
        private String name;
        private String kennzeichen;
        private double laenge;

        public void Schiff(String name, double laenge) {
            this.name = name;
            this.laenge = laenge;
        }
        public void setKennzeichen(String kennzeichen) {
            this.kennzeichen = kennzeichen;
        }
        public void empfangeNachricht(String msg) {
            System.out.println(msg + this.name + this.kennzeichen);
        }
    }

     public static class Schifffahrtsamt {
        Schiff schiffe[] = new Schiff[50];
        private int  anzahl = 0;

        public void add(Schiff schiff) {
            if(anzahl<50) {
                schiffe[anzahl] = schiff;
                anzahl++;
            } else{
                System.out.println("Schiff kann nicht regestriert werden, zu viele Schiffe sind regestriert");
            }
        }
        public void meldung(String nachricht, int dringlichkeit) {
            if(dringlichkeit == 1) {
                for(int iter = 0; iter < anzahl; iter++) {
                    schiffe[iter].empfangeNachricht(nachricht);
                }
            }
        }   
        public static String getKennzeichen() {
            java.util.Random rnd = new java.util.Random();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i <6; i++) {
                sb.append((char)((rnd.nextInt(25)+65)));
            }
            return sb.toString();
        }
     }

    public static class Werft {
        public void produziereSchiff(String name, double laenge, Schifffahrtsamt amt) {
            Schiff schiff = new Schiff(name, laenge);
                amt.add(schiff);
                schiff.setKennzeichen(Schifffahrtsamt.getKennzeichen());
        }
    }
  public static void main(String[] args) {

        Schifffahrtsamt amt = new Schifffahrtsamt();
        Werft w1 = new Werft();
        w1.produziereSchiff("Gertrut", 12.5, amt);
        Schiff sc1 = new Schiff("Merlin", 45.9);
        amt.regestriereSchiff(sc1);
        sc1.setKennzeichen(Schifffahrtsamt.getKennzeichen());
        amt.meldung("Havarie im Rhein bei Rheinkilometer 591.",1);
        amt.meldung("Sonnenschein bei Rheinkilometer 650", 0);
    }


} 
