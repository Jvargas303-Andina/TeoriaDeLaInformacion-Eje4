package Proyect;

import Proyect.Logica.ClassTable;
import Proyect.Otros.ScannerClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClassTable classTable = new ClassTable();

        System.out.println("""
        *------------------------------------*
        | Teoria de la informacion -  EJE 4  |
        |      Juan Felipe Vargas Cortes     |
        |       Sherledys Moreno Calle       |
        *------------------------------------*
        """);

        System.out.println("Digite el rango para encontrar la criba de Eratostenes");

        int valorInicial = ScannerClass.integerText("Valor inicial");
        int valorFinal = classTable.validateMajorDate(valorInicial);

        List<Integer>  listNumber = classTable.getList(valorInicial, valorFinal);
        classTable.createTable(listNumber);

    }
}