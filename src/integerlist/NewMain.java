/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerlist;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.*;

/**
 *
 * @author Wladislaw
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int eingabe;
        int typ;
        double eingabe_2;
        int status;
        boolean loop = true;
        System.out.println("Groesse Array?");
        eingabe = Integer.parseInt(br.readLine());
        System.out.println("Welcher Datentyp ?");
        System.out.println("1: Integer");
        System.out.println("2: Double");
        typ = Integer.parseInt(br.readLine());

        if (typ == 1) {
            ArrayGList<Integer> ail = new ArrayGList<Integer>(eingabe);
            while (loop) {
                System.out.println("Menü:");
                System.out.println("1: getLength");
                System.out.println("2: insertLast");
                System.out.println("3: getFirst");
                System.out.println("4: deleteFirst");
                System.out.println("5: search");
                System.out.println("6: print");
                System.out.println("7:append");
                System.out.println("8: beenden");
                eingabe = Integer.parseInt(br.readLine());
                switch (eingabe) {
                    case 1:
                        System.out.println("Länge: " + ail.getLength());
                        break;
                    case 2:
                        System.out.println("Geben Sie eine Zahl ein:");
                        eingabe = Integer.parseInt(br.readLine());
                        status = ail.insertLast(eingabe);
                        System.out.println("Status: " + status);
                        break;
                    case 3:
                        System.out.println("First: " + ail.getFirst());
                        break;
                    case 4:
                        System.out.println("Status: " + ail.deleteFirst());
                        break;
                    case 5:
                        System.out.println("Wonach soll gesuch werden?");
                        eingabe = Integer.parseInt(br.readLine());
                        System.out.println("Status:" + ail.search(eingabe));
                        break;
                    case 6:
                        ail.print();
                        break;
                    case 7:
                        System.out.println("Geben Sie die Größe des Arrays ein:");
                        int hilfe1 = Integer.parseInt(br.readLine());
                        Integer[] values = new Integer[hilfe1];
                        System.out.println("Geben Sie die Werte fuer den Array ein:");
                        for (int i = 0; i < hilfe1; i++) {
                            System.out.println((i + 1) + ". Wert:");
                            int hilfe2 = Integer.parseInt(br.readLine());
                            values[i]=hilfe2;
                            
                        }
                        System.out.println(ail.append(values));
                        break;
                    case 8:
                        loop = false;
                        break;
                    default:
                        System.out.println("Falsche Eingabe!");
                        break;
                }
            }
        }

        if (typ == 2) {

            ArrayGList<Double> ail = new ArrayGList<Double>(eingabe);

            while (loop) {
                System.out.println("Menü:");
                System.out.println("1: getLength");
                System.out.println("2: insertLast");
                System.out.println("3: getFirst");
                System.out.println("4: deleteFirst");
                System.out.println("5: search");
                System.out.println("6: print");
                System.out.println("7: append");
                System.out.println("8: beenden");
                eingabe = Integer.parseInt(br.readLine());
                switch (eingabe) {
                    case 1:
                        System.out.println("Länge: " + ail.getLength());
                        break;
                    case 2:
                        System.out.println("Geben Sie eine Zahl ein:");
                        eingabe_2 = Double.parseDouble(br.readLine());
                        status = ail.insertLast(eingabe_2);
                        System.out.println("Status: " + status);
                        break;
                    case 3:
                        System.out.println("First: " + ail.getFirst());
                        break;
                    case 4:
                        System.out.println("Status: " + ail.deleteFirst());
                        break;
                    case 5:
                        System.out.println("Wonach soll gesuch werden?");
                        eingabe_2 = Double.parseDouble(br.readLine());
                        System.out.println("Status:" + ail.search(eingabe_2));
                        break;
                    case 6:
                        ail.print();
                        break;

                    case 7:
                        System.out.println("Geben Sie die Größe des Arrays ein:");
                        int hilfe1 = Integer.parseInt(br.readLine());
                        Double[] values = new Double[hilfe1];
                                double hilfe2;
                        System.out.println("Geben Sie die Werte fuer den Array ein:");
                        for (int i = 0; i < hilfe1; i++) {
                            System.out.println((i + 1) + ". Wert:");
                             hilfe2 = Double.parseDouble(br.readLine());
                            values[i]=hilfe2;
                        }
                        System.out.println(ail.append(values));
                        break;
                    case 8:
                        loop = false;
                        break;
                    default:
                        System.out.println("Falsche Eingabe!");
                        break;

                }
            }
        }

    }
}
