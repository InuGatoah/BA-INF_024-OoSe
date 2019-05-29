import java.lang.Comparable;

class Person implements Comparable <Person> {
    String Name;
    String Vorname;
    int Postleitzahl;
    String Strasse;
    int Hausnummer;

    Person (String Name, String Vorname, int Postleitzahl, String Strasse, int Hausnummer)
    {
        this.Name = Name;
        this.Vorname = Vorname;
        this.Postleitzahl = Postleitzahl;
        this.Strasse = Strasse;
        this.Hausnummer = Hausnummer;
    }


    @Override
    public int compareTo(Person o) {
        Person entry = (Person) o;
        int result = Name.compareTo(entry.Name);
        if (result != 0){
            return result;
        }
        result = Vorname.compareTo(entry.Vorname);
        if (result != 0){
            return result;
        }
        result = Postleitzahl - entry.Postleitzahl;
        if (result != 0){
            return (int)result/Math.abs(result);
        }
        result = Strasse.compareTo(entry.Strasse);
        if (result != 0){
            return result;
        }
        result = Hausnummer - entry.Hausnummer;
        if (result != 0){
            return (int)result/Math.abs(result);
        }
        return 0;
    }
}

// a)

import java.util.TreeSet;

public class Example {

    public static void main(String[] args) {
        TreeSet<Person> ex = new TreeSet<Person>();
        ex.add(new Person("Smith", "John", 37564, "Kirchstrasse", 1));
        ex.add(new Person("Prefect", "Ford", 37564, "Kirchstrasse", 1));
        ex.add(new Person("Newton", "Isaac", 37566, "Steinweg", 6));


        for(Person e : ex) {
            System.out.println(e.Name + " " + e.Vorname + " " + e.Postleitzahl + " " + e.Strasse + " " + e.Hausnummer);
        }
    }

}

