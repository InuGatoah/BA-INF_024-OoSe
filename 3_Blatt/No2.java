/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 6-5-2019                               *
 * Description: Experimente mit Shallow und Deep*
 *              Cloaning                        *
 * File: No2.java                               *
 * Compile: javac No2.java                      *
 \**********************************************/

class No2 {

    public static class Sheep {
        public String name;
        public Fur fur;
        public Sheep(String name, Fur fur) {
            this.name = name;
            this.fur = fur;
        }
        public void shear() {
            fur.length = 0;
        }
        public String toString() {
            return "Name: " + name + " " + fur.toString();
        }
        public Sheep clone() {                              //Shallow clone
            return this;
        }
        public Sheep d_clone() {                         //Deep Clone
        Fur f = new Fur(this.fur.length);
        Sheep sheep = new Sheep(this.name, f);
        return sheep;
        }
       //c
        public Boolean equals(Sheep sheep) {
            if(this.name != sheep.name) {
                return false;
            } else if(this.fur != sheep.fur) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static class Fur {
        public int length;
        public Fur(int length) {
            this.length = length;
        }
        public String toString() {
        return "Felllaenge: " + length;
        }
    }

    //a
    
    public static void main (String[] args) {
        Fur f = new Fur(10);
        Sheep sheep = new Sheep("Schaf_1", f);
        Sheep sheep_clone = sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep_clone.toString());
        System.out.println("Nun wird der Klon bearbeitet");
        sheep_clone.name = "Schaf 2";
        sheep_clone.shear();
        System.out.println(sheep.toString());                   // "Schaf 2 Felllaenge: 0" -> shallow copy
        System.out.println(sheep_clone.toString());
    }

    // b
    // shallow copy:Both objects share same objects, copy is not independent.
    //              If you modify the clone the original is effected aswell!
    // deep copy:   Creates afully independent copy of an object.i
    
    public static void shallow_clone() {
        System.out.println("b. Shallow clone:");
        Fur f_b = new Fur(15);
        Sheep sheep_shallow = new Sheep("Shally", f_b);
        Sheep sheep2_shallow = sheep_shallow.clone();

        System.out.println(sheep_shallow.toString());
        System.out.println(sheep2_shallow.toString());
        System.out.println("Nun wird der Klon bearbeitet");
        sheep2_shallow.name = "Sally";
        sheep2_shallow.shear();
        System.out.println(sheep_shallow.toString());                   // "Schaf 2 Felllaenge: 0" -> shallow copy
        System.out.println(sheep2_shallow.toString());
    }

    public static void deep_clone() {
        System.out.println("b. Deep clone");
        Fur f_b = new Fur(15);
        Sheep sheep_deep = new Sheep("Deepy", f_b);
        Sheep sheep2_deep = sheep_deep.d_clone();

        System.out.println(sheep_deep.toString());
        System.out.println(sheep2_deep.toString());
        System.out.println("Nun wird der Klon bearbeitet");
        sheep_deep.name = "Debby";
        sheep2_deep.shear();
        System.out.println(sheep_deep.toString());                   // "Schaf 2 Felllaenge: 0" -> shallow copy
        System.out.println(sheep2_deep.toString());
    }

    //d Interface Clonable
    
    
}
