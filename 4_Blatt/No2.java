/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 11-5-2019                               *
 * Description: a) "I don't like Blumenkol an   *
 *                  Gorgonzolasoße"             *
 *              b) "I like Spaghetti Bologneser *
 *                  Art"                        *
 *              c) "I like Blumenkohl an        *
 *                  Gorgonzolasoße"             *
 * File: No2.java                               *
 * Compile: javac No2.java                      *
 \**********************************************/

class No2 {

    interface Food {
        public String getMeal();
    }
    static class Cauliflower implements Food {
        public String getMeal() {
            return "Blumenkohl an Gorgonzolasoße";
        }
    }   
    static class Spaghetti implements Food {
        public String getMeal() {
            return "Spaghetti Bologneser Art";
        }
    }
    //Die zweite Klasse Student:
    static class Student {
        public static void eat(Food food) {
            System.out.println("I like " + food.getMeal());
        }
        public static void eat(Cauliflower Cauliflower) {
            System.out.println("I don’t like " + Cauliflower.getMeal());
        }
    }

    public static void main (String[] args) {
        //a
        Cauliflower essen1 = new Cauliflower();
        Student.eat(essen1);
        //b
        Spaghetti essen2 = new Spaghetti();
        Student.eat(essen2);
        //c
        Food essen = new Cauliflower();
        Student.eat(essen);
    }

}
