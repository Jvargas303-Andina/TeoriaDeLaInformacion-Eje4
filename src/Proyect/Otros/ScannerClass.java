package Proyect.Otros;

import java.util.Scanner;

public class ScannerClass {

    public static Scanner sc = new Scanner(System.in);

    public static int integerText (String message){
        System.out.print(message + " : ");

        while (!sc.hasNextInt()){
            System.out.print("Dato invalido ...\n" +message + " : ");
            sc.next();
        }

        int dato = sc.nextInt();
        sc.nextLine();
        return dato;
    }

    public static double doubleText (String message){
        System.out.print(message + " : ");

        while (!sc.hasNextDouble()){
            System.out.print("Dato invalido ...\n" +message + " : ");
            sc.next();
        }

        double dato = sc.nextDouble();
        sc.nextLine();
        return dato;
    }

    public static String stringText (String message){
        System.out.print(message + " : ");

        while (!sc.hasNextLine()){
            System.out.print("Dato invalido ...\n" +message + " : ");
            sc.next();
        }

        String dato = sc.nextLine();
        sc.nextLine();
        return dato;
    }

}
