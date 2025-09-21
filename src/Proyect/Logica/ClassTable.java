package Proyect.Logica;

import Proyect.Otros.ScannerClass;

import java.util.*;

public class ClassTable {

    public int validateMajorDate(int valorInicial) {

        boolean status = false;
        int valorFinal = ScannerClass.integerText("Valor final");

        while (!status) {
            if (valorFinal <= valorInicial) {
                System.out.println("\nEl valor final debe ser mayor al valor inicial [ " + valorInicial + " ]");
                valorFinal = ScannerClass.integerText("Valor final");
                System.out.println();

            }else {
                status = true;
            }
        }

        return valorFinal;
    }

    public List<Integer> getList(int valorInicial, int valorFinal) {
        List<Integer> finalLista = new ArrayList<>();
        for (int i = valorInicial; i <= valorFinal; i++) {
            finalLista.add(i);
        }
        return finalLista;
    }

    public void createTable(List<Integer> listNumber) {
        int orden = 0;
        String color;

        for (int i = 0; i < listNumber.size(); i++) {

            orden ++;
            color = getListColor(listNumber.get(i));

            System.out.print("[ " + listNumber.get(i) + " " + color + " ]");
            if (orden % 10 == 0) {
                System.out.println();
            }

        }
    }

    private String getListColor (int numero){

        if (numero == 1){
            /// AZUL
            return "\uD83D\uDC99";

        }
        else if (numero % 2 == 0 && numero != 2) {
            /// ROJO
            return "♥\uFE0F";

        } else if (numero % 3 == 0 && numero != 3) {
            /// NARANJA
            return "\uD83E\uDDE1";

        }  else if (numero % 5 == 0 && numero != 5) {
            /// AMARILLO
            return "\uD83D\uDC9B";

        }  else if (numero % 7 == 0 && numero != 7) {
            /// VERDE
            return "\uD83D\uDC9A";

        }  else {
            /// N/A
            return "  ";

        }
    }

}
