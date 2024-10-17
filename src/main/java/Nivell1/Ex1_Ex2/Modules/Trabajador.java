package Nivell1.Ex1_Ex2.Modules;

public class Trabajador {

    private String nom;
    private String cognom;
    private double precioHora;

    public Trabajador(String nombre, String apellido, double precioHora) {
        this.nom = nombre;
        this.cognom = apellido;
        this.precioHora = precioHora;
    }

    @Deprecated
    public String getNom() {
        return nom;
    }

    @Deprecated
    public String getCognom() {
        return cognom;
    }



    public double calcularSueldo(int horasTrabajadas) {
        return horasTrabajadas * this.precioHora;
    }

    public String toString() {
        return "Trabajador " + this.nom + " " + this.cognom + " cobra " + this.precioHora + "€ la hora";
    }


}
