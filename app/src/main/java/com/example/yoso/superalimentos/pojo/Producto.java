package com.example.yoso.superalimentos.pojo;

/**
 * POJO PRODUCTO
 * Created by yoso on 19/04/17.
 */

public class Producto {
    // Atributos
    private int id;
    private String nombre;
    private int unidades;
    private int precio;
    private int idDrawable;

    // Constructor
    public Producto(String nombre, int unidades, int precio, int idDrawable) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
        this.idDrawable = idDrawable;
    }

    // Crea un constructor vacio de Producto
    public Producto() {

    }


    // Métodos getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }
}
