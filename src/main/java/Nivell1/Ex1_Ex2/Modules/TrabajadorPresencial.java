package Nivell1.Ex1_Ex2.Modules;

public class TrabajadorPresencial extends Trabajador{

    private static double gastoGasolina = 50;

    public TrabajadorPresencial(String nom, String cognom, double precioHora) {
        super(nom, cognom, precioHora);
    }

    @Deprecated
    public String getNom() {
        return super.getNom();
    }
    @Deprecated
    public String getCognom() {
        return super.getCognom();
    }

    public static double getGastoGasolina() {
        return gastoGasolina;
    }

    public static void setGastoGasolina(double gastoGasolina) {
        TrabajadorPresencial.gastoGasolina = gastoGasolina;
    }

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + this.gastoGasolina;
    }


    @Override
    public String toString() {
        return super.toString() + " en modo Presencial y con un gasto de " + this.gastoGasolina +
                                                                                "€ de gasolina al mes";
    }
}
