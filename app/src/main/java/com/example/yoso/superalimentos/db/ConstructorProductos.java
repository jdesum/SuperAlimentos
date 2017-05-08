package com.example.yoso.superalimentos.db;

import android.content.Context;

import com.example.yoso.superalimentos.pojo.Producto;

import java.util.ArrayList;

/**
 * Interactor
 * Created by yoso on 23/04/17.
 */

public class ConstructorProductos {

    private Context context;

    // Constructor
    public ConstructorProductos(Context context) {
        this.context = context;
    }

    public ArrayList<Producto> obtenerDatos(){
        BaseDatosProductos db = new BaseDatosProductos(context);

        return db.obtenerTodosLosProductos();
    }
}
