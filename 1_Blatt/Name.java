/***********************************************\
 * Author: Susi Gentsch                         *
 * Date: 12-4-2019                              *
 * Description: Druckt einen Wert aus der       *
 *              Kommandozeile                   *
 * File: Name.java                              *
 * Compile: javac Name.java                     *
 \**********************************************/

public class Name {
    public static void main(String[] args) {
        System.out.println("Hallo " + args[0] + "!");

        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        String operator = args[3];

        switch(operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "x":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Kein gültiger Operant");
        }
    }
}
