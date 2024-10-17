package Nivell1.Ex1_Ex2.Main;


import Nivell1.Ex1_Ex2.Modules.Trabajador;
import Nivell1.Ex1_Ex2.Modules.TrabajadorOnLine;
import Nivell1.Ex1_Ex2.Modules.TrabajadorPresencial;

public class Main {

    @SuppressWarnings("deprecation")  /// <- Ex 2 usar el SuppressWarnings
    public static void main(String[] args) {

        int horasMensuales = 40 * 4;

        Trabajador trabajadorGenerico = new Trabajador("Carlos", "Luna", 8.50);
        TrabajadorPresencial tPresencial = new TrabajadorPresencial("Laia", "Madueño", 9.60);
        TrabajadorOnLine tOnline = new TrabajadorOnLine("Albert", "Marin", 10.55);

        System.out.println(trabajadorGenerico + "\nSueldo Mensual " +
                                trabajadorGenerico.calcularSueldo(horasMensuales) + "€");

        System.out.println(tPresencial + "\nSueldo Mensual " +
                                tPresencial.calcularSueldo(horasMensuales) + "€");

        System.out.println(tOnline + "\nSueldo Mensual " +
                                tOnline.calcularSueldo(horasMensuales) + "€");



        tPresencial.getNom();

    }
}