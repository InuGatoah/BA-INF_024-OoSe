/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 26-4-2019                              *
 * Description: Vergleicht Zahlen               *
 *                                              *
 *              Double speichert genauere       *
 *              Informationen über die Zahl,    *
 *              deshalb ist 6.4 kleiner als 6.4f*
 *                                              *
 *              6.5 und 6.5f sind gleich weil   *
 *              sie Binär gleich dargestellt    *
 *              werden                          *
 * File: No2.java                               *
 * Compile: javac No2.java                      *
 \**********************************************/

class No2 {
    public static void main(String[] args) {
        float a = 6.5f;         
        double b = 6.5;                             
        float c = 6.4f;
        double d = 6.4;

        if(a == b) {
            System.out.println("6.5f und 6.5 sind gleich");
        } else {
            System.out.println("6.5f und 6.5 sind nicht gleich");
        }

        if(c == d) {
            System.out.println("6.4f und 6.4 sind gleich");
        } else { 
            System.out.println("6.4f und 6.4 sind nicht gleich");
        }
    }
}

