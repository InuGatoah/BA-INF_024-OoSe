/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 11-5-2019                               *
 * Description: Ubung mit Comparable            *
 * File: No3.java                               *
 * Compile: javac No3.java                      *
 \**********************************************/
import java.lang.Comparable;


class No3 {

    public static class Person implements Comparable<Person> {
    
        private String name;
        private String vname;
        private int plz;
        private String strasse;
        private int hnummer;

        public Person(String name, String vname, int plz, String strasse, int hnummer) {
            this.name =  name;
            this.vname = vname;
            this.plz = plz;
            this.strasse = strasse;
            this.hnummer = hnummer;
        }

        public String toString() {
            return "Name: " + name + ", Vorname: " + vname + ", Postleitzahl: " + plz + ", Strasse " + strasse + ", Hausnummer " + hnummer;
        }

        public int compareTo(Person p) {
            int dif = 0;

            dif = p.name.compareTo(this.name);
            if(dif != 0) {
                return dif;
            }
            dif = p.vname.compareTo(this.vname);
            if(dif != 0) {
                return dif;
            }
            dif = p.plz.compareTo(this.plz);
            if(dif != 0) {
                return dif;
            }
             dif = p.strasse.compareTo(this.strasse);
            if(dif != 0) {
                return dif;
            }
            dif = p.hnummer.compareTo(this.hnummer);
            if(dif != 0) {
                return dif;
            }
            return dif;
        }
    }
    
    public static Person findMin(Person[] p) {
        Person result = p[0];
        for(int iter = 0; iter < p.length - 1; iter++) {
            if(p[iter].compareTo(p[iter + 1]) < 0) {
                result = p[iter + 1];
            }
        }
    }
    public static void main(String[] args) {
        Person[] p_array = new Person[3];
        p_array[0] = new Person("Husa", "Lena", 43896, "Loch", 12);
        p_array[1] = new Person("Husa", "Eike", 43896, "Loch", 2);
        p_array[2] = new Person("Gedeck", "Karin", 43896, "Bechel-Str.", 12);
        Person min = findMin(p_array);

        System.out.println(toString(min));
    }
}
