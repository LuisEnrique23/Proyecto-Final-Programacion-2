package usmp.com.edu.dashboard.model;

public class Salary {


    private Integer dni;
    private String nombre;
    private double sueldo;
    private double total_impuesto;
    private double total_bruto;
    private double total_neta;
    private int retencion_mensual;

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }



    public double getTotal_impuesto() {
        return total_impuesto;
    }

    public void setTotal_impuesto(double total_impuesto) {
        this.total_impuesto = total_impuesto;
    }

    public double getTotal_bruto() {
        return total_bruto;
    }

    public void setTotal_bruto(double total_bruto) {
        this.total_bruto = total_bruto;
    }

    public double getTotal_neta() {
        return total_neta;
    }

    public void setTotal_neta(double total_neta) {
        this.total_neta = total_neta;
    }

    public int getRetencion_mensual() {
        return retencion_mensual;
    }

    public void setRetencion_mensual(int retencion_mensual) {
        this.retencion_mensual = retencion_mensual;
    }


}
