package com.programaci.n2.viajes.model;

public class Pago {

    private String numeroTarjeta;
    private String fechaVencimiento;
    private String codigoCVC;
    private String nombreTarjeta;
    private String viaje1;
private int value;

    public String getViaje1() {
        return viaje1;
    }

    public void setViaje1(String viaje1) {
        this.viaje1 = viaje1;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCodigoCVC() {
        return codigoCVC;
    }

    public void setCodigoCVC(String codigoCVC) {
        this.codigoCVC = codigoCVC;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
