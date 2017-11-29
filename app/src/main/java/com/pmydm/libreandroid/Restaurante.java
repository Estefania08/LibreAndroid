package com.pmydm.libreandroid;

import java.io.Serializable;

/**
 * Created by alumno on 21/11/2017.
 */

public class Restaurante implements Serializable{
    private String nombreRestaurante;
    private String menu;
    private String localizacion;
    private int estrellas;
    private int fechaApertura;
    private int horario;
    private int capacidadDeClientes;
    //constructores

    public Restaurante() {
    }

    public Restaurante(String nombreRestaurante, String menu, String localizacion, int estrellas, int fechaApertura, int horario, int capacidadDeClientes) {
        this.nombreRestaurante = nombreRestaurante;
        this.menu = menu;
        this.localizacion = localizacion;
        this.estrellas = estrellas;
        this.fechaApertura = fechaApertura;
        this.horario = horario;
        this.capacidadDeClientes = capacidadDeClientes;
    }

    public Restaurante(String nombreRestaurante, String menu, String localizacion, int estrellas, int capacidadDeClientes) {
        this.nombreRestaurante = nombreRestaurante;
        this.menu = menu;
        this.localizacion = localizacion;
        this.estrellas = estrellas;
        this.capacidadDeClientes = capacidadDeClientes;
    }

    //setter&getter

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(int fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getCapacidadDeClientes() {
        return capacidadDeClientes;
    }

    public void setCapacidadDeClientes(int capacidadDeClientes) {
        this.capacidadDeClientes = capacidadDeClientes;
    }

    //método toString

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombreRestaurante='" + nombreRestaurante + '\'' +
                ", menu='" + menu + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", estrellas=" + estrellas +
                ", fechaApertura=" + fechaApertura +
                ", horario=" + horario +
                ", capacidadDeClientes=" + capacidadDeClientes +
                '}';
    }
}
