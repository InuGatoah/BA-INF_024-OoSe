/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 17-4-2019                              *
 * Description: Liest und druckt einen Namen    *
 * File: No2.java                               *
 * Compile: javac -cp input.jar No2.java        *
 \**********************************************/


class No2 {
    public static void main(String[] args) {
        System.out.print("Wie ist dein Name? ");
        String name = Input.readString();
        System.out.println("Hallo " + name + "!");
    }
}
