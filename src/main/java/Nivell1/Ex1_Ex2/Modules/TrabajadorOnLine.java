package Nivell1.Ex1_Ex2.Modules;

public class TrabajadorOnLine extends Trabajador {

    final static double precioTarifa = 49.99;

    public TrabajadorOnLine(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Deprecated
    public String getNom() {
        return super.getNom();
    }

    @Deprecated
    public String getCognom() {
        return super.getCognom();
    }

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + precioTarifa;
    }

    @Override
    public String toString() {
        return super.toString() + " en modo Presencial y con un gasto de " + this.precioTarifa +
                "€ de tarifa de internet al mes";
    }
}


